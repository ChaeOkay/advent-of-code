(ns advent-of-code.01
  (:require [clojure.java.io :as io]))

; Day 1: Chronical Calibration

"Given an integer and a string, convert string to integer and return sum"
(defn convert-and-sum
  [accumulator integer-string]
  (let [converted-string (Integer/parseInt integer-string)]
    (+ accumulator converted-string)))

"Part 1"
(defn part-1
  [input]
  (reduce convert-and-sum 0 input))

"Calculate frequency based on sequence of readings"
(defn run
  [input]
  (println (part-1 input)))
