(ns class-closure.chart-helper
  (:require [cljsjs.chartjs]))

(defn chart-js-map [f coll]
  (.each (.-helpers js/Chart)
         coll
         f))

(def month-options
  {:options {:scales {:xAxes [{:type "time"
                               :time {:unit "month"}}]}}})
