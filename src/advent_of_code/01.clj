(ns advent-of-code.01
  (:require [clojure.java.io :as io]))

; Day 1: Chronical Calibration

"Given a file path, returns lazy sequence of file contents by line"
(defn read-input
  [resource-path]
  (-> resource-path
      (io/resource)
      (io/input-stream)
      (io/reader)
      line-seq
      seq))

"Given an integer and a string, convert string to integer and return sum"
(defn convert-and-sum
  [accumulator integer-string]
  (let [converted-string (Integer/parseInt integer-string)]
    (+ accumulator converted-string)))

"Calculate frequency based on input file contents"
(defn run
  [input]
  (let [frequency-readings (read-input input)]
    (reduce convert-and-sum 0 frequency-readings)))
