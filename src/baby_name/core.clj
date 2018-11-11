(ns baby-name.core)

(def pth "/path-to-csv-file")
(def last-name "Last")

(def header [:name :meaning :first :second :p1 :p2])

(def data (->> pth slurp csv/read-csv (drop 3)))

(def maps
  (map #(zipmap header %) data))

(doseq [[f s]
        (filter some?
                (for [f (filter #(= "x" (:first %)) maps)
                      s (filter #(= "x" (:second %)) maps)]

                  (when (not= (:name f) (:name s))
                    [(:name f) (:name s)])))]

  (println f " " s " " last-name))

(filter some?
        (for [f (filter #(= "x" (:first %)) maps)
              s (filter #(= "x" (:second %)) maps)]

          (when (not= (:name f) (:name s))
            [(:name f) (:name s)])))
