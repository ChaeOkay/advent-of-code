(ns advent-of-code.01
  (:require [clojure.java.io :as io]))

"Given a file path, returns lazy sequence of file contents by line"
(defn read-input
  [resource-path]
  (-> resource-path
      (io/resource)
      (io/input-stream)
      (io/reader)
      line-seq
      seq))

"Calculate frequency based on input file contents"
(defn run
  [input]
  (read-input input))
