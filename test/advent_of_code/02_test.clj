(ns advent-of-code.02-test
  (:require [advent-of-code.01 :as day2]
            [clojure.test :refer :all]))

(deftest run
  (testing "example input"
    (let [input (seq ["abcdef"
                      "bababc"
                      "abbcde"
                      "abcccd"
                      "aabcdd"
                      "abcdee"
                      "ababab"])]
      (is (= (day2/run input) 12)))))
