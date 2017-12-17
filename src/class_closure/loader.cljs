(ns class-closure.loader
  (:require-macros [cljs.core.async.macros :refer [go-loop]])
  (:require [cljs.core.async :refer [chan <! put!]]
            [class-closure.state :as state]))

(defn read-csv [csv]
  (js/console.log csv))

(def csv->json
  (map #(-> %
            .-target
            .-result
            read-csv)))

(def file-reads (chan 1 csv->json))

(go-loop []
  (let [text (<! file-reads)]
    (swap! state/app-state assoc :dates text)))

(let [reader (js/FileReader.)]
  (set! (.-onload reader) #(put! file-reads %))
  (js/console.log "ayy")
  (.readAsText reader "data/dates.csv"))
