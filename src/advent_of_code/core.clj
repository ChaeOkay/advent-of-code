(ns advent-of-code.core
  (:require advent-of-code.01
            [advent-of-code.utils :as utils]))

(defn retreive-input-for-day
  [day]
  (let [resource-path (str "2018/" day "_input.txt")]
    (utils/read-input resource-path)))

(defn -main
  "Given a two digit day, runs relative code against relative resource input text file"
  [day & args]
  (let [input (retreive-input-for-day day)
        resource-function (ns-resolve (symbol (str "advent-of-code." day)) 'run)]
    (println (resource-function input))))
