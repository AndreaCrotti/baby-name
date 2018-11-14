(ns baby-name.core
  (:require [clojure.data.csv :as csv]
            [environ.core :as env]))

(def header [:name :first :second :p1 :p2])

(def behind-the-name-api-key (:behind-the-name-api-key env/env))

(defn combinations
  [names]
  (filter some?
          (for [f (filter #(:first %) names)
                s (filter #(:second %) names)]

            (when (not= (:name f) (:name s))
              [(:name f) (:name s)]))))

(defn combinations-from-csv
  [filename]
  (->> filename
       slurp
       csv/read-csv
       (map (fn [v] (zipmap header v)))
       combinations))

(defn -main [& [filename]]
  (combinations-from-csv filename))
