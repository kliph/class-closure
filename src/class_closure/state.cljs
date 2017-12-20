(ns class-closure.state
  (:require [reagent.core :as r]))

(def app-state (r/atom {:dates nil
                        :closures nil}))
