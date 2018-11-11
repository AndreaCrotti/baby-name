(ns baby-name.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [baby-name.core :as sut]))

(deftest generated-names-test
  (testing "Generate combinations of names"
    (is (= [["Grace" "Rose"]]
           (sut/combinations [{:name "Grace" :first true :second false
                               :p1 true :p2 true}
                              {:name "Rose" :first false :second true
                               :p1 true :p2 true}])))))
