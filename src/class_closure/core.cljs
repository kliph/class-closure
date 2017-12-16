(ns class-closure.core
  (:require [reagent.core :as r]
            [cljsjs.chartjs]
            [goog.dom]))

(def by-id goog.dom.getElement)

(defn render-chart []
  (let [context (-> (by-id "chart")
                    (.getContext "2d"))
        chart-data {:type "bar"
                    :data {:labels ["2012" "2013" "2014" "2015" "2016"]
                           :datasets [{:data [5 10 15 20 25]
                                       :label "Rev in MM"
                                       :backgroundColor "#90EE90"}
                                      {:data [3 6 9 12 15]
                                       :label "Cost in MM"
                                       :backgroundColor "#F08080"}]}}]
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
