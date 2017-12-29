(ns class-closure.core
  (:require [reagent.core :as r]
            [class-closure.chart-helper :as chart]
            [class-closure.state :as state]
            [cljsjs.moment]
            [cljsjs.chartjs]
            [goog.dom]
            [class-closure.loader]
            [goog.date]))

(def by-id goog.dom.getElement)
(def banal-blue "#2f588b")
(def ugly-green "#5d9649")

(defn data-for-chart [chart-data]
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
        d (nth commit-dates 3 [])
        get-counts (fn [dataset]
                     (->> (map (fn [d]
                                 (-> (filter (fn [[k v]] (= d v)) dataset)
                                     count))
                               commit-dates)
                          (reductions +)))
        open-files (get-counts first-commits)
        closed-files (get-counts last-commits)]
    (assoc chart-data :data {:labels commit-dates
                             :datasets [{:data open-files
                                         :label "Open Files"
                                         :lineTension 0
                                         :borderColor banal-blue}
                                        {:data closed-files
                                         :label "Closed Files"
                                         :lineTension 0
                                         :borderColor ugly-green}]})))

(defn render-to-chart [chart-data]
  (let [context (-> (by-id "chart")
                    (.getContext "2d"))]
    (chart/chart-js-map (fn [instance]
                          (.destroy instance))
                        (.-instances js/Chart))
    (js/Chart. context (clj->js chart-data))))

(defn render-chart []
  (-> (data-for-chart (:chart-base @state/app-state))
      render-to-chart))

(defn chart [base-chart]
  (class-closure.loader/init)
  (fn [base-chart]
    (if (@state/app-state :loaded)
      (r/create-class
       {:component-did-mount #(render-chart)
        :component-did-update #(render-chart)
        :display-name "app-container"
        :reagent-render (fn [base-chart]
                          [:canvas {:id "chart"
                                    :width "700"
                                    :height "350"}])})
      [:p "Loading"])))

(defn toggle-month-view! []
  (if (contains? (@state/app-state :chart-base) :options)
    (swap! state/app-state update-in [:chart-base] dissoc :options)
    (swap! state/app-state update-in [:chart-base] merge chart/month-options)))

(defn app-container []
  [:div
   [chart (@state/app-state :chart-base)]
   [:button {:on-click toggle-month-view!} "Toggle Calendar/Ordinal"]])

(r/render-component [app-container] (by-id "app"))
