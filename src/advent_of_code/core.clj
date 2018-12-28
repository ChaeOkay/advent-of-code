(ns advent-of-code.core
  (:require [advent-of-code.01]))

(defn -main
  "Given a two digit day, runs relative code against relative input.txt"
  [day & args]
  (let [resource-path (str "2018/" day "/input.txt")
        resource-function (ns-resolve (symbol (str "advent-of-code." day)) 'run)]
    (println (resource-function resource-path))))
