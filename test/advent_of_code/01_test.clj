(ns advent-of-code.01-test
  (:require [advent-of-code.01 :as day1]
            [clojure.test :refer :all]))

(deftest convert-and-sum
  (testing "Strings can be converted and added to accumulators"
    (is (= (day1/convert-and-sum 1 "+4") 5))))

(deftest part-1
  (testing "returns correct accumulator result over sequence of input data"
    (let [input (seq ["-1" "+3"])]
      (is (= (day1/part-1 input) 2)))))
