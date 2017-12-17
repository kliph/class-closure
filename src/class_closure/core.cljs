(ns class-closure.core
  (:require [reagent.core :as r]
            [class-closure.state :as state]
            [cljsjs.chartjs]
            [goog.dom]
            [goog.date]))

(def by-id goog.dom.getElement)

(defn render-chart []
  (let [context (-> (by-id "chart")
                    (.getContext "2d"))
        dates-csv (@state/app-state :dates)
        dates (->> (clojure.string/split dates-csv "\n")
                   (drop 1)
                   (map #(let [[commit date] (clojure.string/split % ",")]
                           [(keyword commit) date]))
                   (into {}))
        closures-csv (@state/app-state :closures)
        closure-triplets (->> (clojure.string/split closures-csv "\n")
                              (drop 1)
                              (map #(let [[filename first-commit last-commit] (clojure.string/split % ",")]
                                      [filename (get dates (keyword first-commit)) (get dates (keyword last-commit))])))
        first-commits (->> (map (fn [[filename first-commit _]]
                                  [filename first-commit]) closure-triplets)
                           (into {}))
        last-commits (->> (map (fn [[filename _ last-commit]]
                                 [filename last-commit]) closure-triplets)
                          (into {}))
        commit-dates (->> (concat (vals first-commits) (vals last-commits))
                          (into #{})
                          (into [])
                          sort)
        d (nth commit-dates 3)
        get-counts (fn [dataset]
                     (->> (map (fn [d]
                                 (-> (filter (fn [[k v]] (= d v)) dataset)
                                     count))
                               commit-dates)
                          (reductions +)))
        first-counts (get-counts first-commits)
        last-counts (get-counts last-commits)
        banal-blue "#2f588b"
        ugly-green "#5d9649"
        chart-data {:type "line"
                    :data {:labels commit-dates
                           :datasets [{:data first-counts
                                       :label "Open Files"
                                       :lineTension 0
                                       :borderColor banal-blue}
                                      {:data last-counts
                                       :label "Closed Files"
                                       :lineTension 0
                                       :borderColor ugly-green}]}}]
    (js/Chart. context (clj->js chart-data))))

(defn app-container []
  (r/create-class
   {:component-did-mount #(render-chart)
    :display-name "app-container"
    :reagent-render (fn []
                      [:canvas {:id "chart"
                                :width "700"
                                :height "380"}])}))

(r/render-component [app-container] (by-id "app"))
