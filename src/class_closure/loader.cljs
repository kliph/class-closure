(ns class-closure.loader
  (:require [goog.net.XhrIo :as xhr]
            [class-closure.state :as state]))

(defn GET [url callback]
  (xhr/send url
            callback))

(defn assoc-in-state [k]
  (fn [e]
    (let [text (-> e
                   .-target
                   .getResponseText)]
      (swap! state/app-state assoc k text)
      (when (and (@state/app-state :dates false)
                 (@state/app-state :closures false))
        (swap! state/app-state assoc :loaded true)))))

(defn get-dates []
  (GET "/dates.csv"
       (assoc-in-state :dates)))

(defn get-closures []
  (GET "/closures.csv"
       (assoc-in-state :closures)))

(defn init []
  (get-dates)
  (get-closures))
