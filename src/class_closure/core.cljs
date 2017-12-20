(ns class-closure.core
  (:require [reagent.core :as r]
            [class-closure.state :as state]
            [cljsjs.chartjs]
            [goog.dom]
            [class-closure.loader]
            [goog.date]))

(def by-id goog.dom.getElement)

(defn data-for-chart []
  (let [dates-csv (@state/app-state :dates)
        closures-csv (@state/app-state :closures)
        dates (->> (clojure.string/split dates-csv "\n")
                   (drop 1)
                   (map #(let [[commit date] (clojure.string/split % ",")]
                           [(keyword commit) date]))
                   (into {}))
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
        last-counts (get-counts last-commits)]
    {:open-files first-counts
     :commit-dates commit-dates
     :closed-files last-counts}))

(defn render-to-chart [data]
  (let [context (-> (by-id "chart")
                    (.getContext "2d"))
        banal-blue "#2f588b"
        ugly-green "#5d9649"
        chart-data {:type "line"
                    :data {:labels (:commit-dates data)
                           :datasets [{:data (:open-files data)
                                       :label "Open Files"
                                       :lineTension 0
                                       :borderColor banal-blue}
                                      {:data (:closed-files data)
                                       :label "Closed Files"
                                       :lineTension 0
                                       :borderColor ugly-green}]}}]
    (js/Chart. context (clj->js chart-data))))

(defn render-chart []
  (js/setTimeout
   (fn []
     (-> (data-for-chart)
         render-to-chart))
   200))

(defn app-container []
  (r/create-class
   {:component-did-mount #(render-chart)
    :display-name "app-container"
    :get-initial-state (fn [] (class-closure.loader/init))
    :reagent-render (fn []
                      [:canvas {:id "chart"
                                :width "700"
                                :height "380"}])}))

(r/render-component [app-container] (by-id "app"))
