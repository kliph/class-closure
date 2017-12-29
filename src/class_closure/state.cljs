(ns class-closure.state
  (:require [reagent.core :as r]))

(def app-state (r/atom {:loaded false
                        :dates nil
                        :chart-base {:type "line"}
                        :closures nil}))
