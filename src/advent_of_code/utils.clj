(ns advent-of-code.utils
  (:require [clojure.java.io :as io]))

"Reads file in resources dir"
(defn read-input
  [resource-path]
  (-> resource-path
      (io/resource)
      (io/input-stream)
      (io/reader)
      line-seq
      seq))
