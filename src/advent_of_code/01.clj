(ns advent-of-code.01
  (:require [clojure.java.io :as io]))

; Day 1: Chronical Calibration

"Given an integer and a string, convert string to integer and return sum"
(defn convert-and-sum
  [accumulator integer-string]
  (let [converted-string (Integer/parseInt integer-string)]
    (+ accumulator converted-string)))

"Calculate frequency based on input file contents"
(defn run
  [input]
    (reduce convert-and-sum 0 input))
