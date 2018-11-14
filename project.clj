(defproject baby-name "0.1.0-SNAPSHOT"
  :description "Help out deciding your baby name"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [environ "1.1.0"]
                 [clj-http "3.9.1"]
                 [org.clojure/data.json "0.2.6"]

                 [hiccup "1.0.5"]
                 [ring "1.7.0"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-mock "0.3.2"]
                 [metosin/ring-http-response "0.9.0"]]

  :plugins [[environ/environ.lein "0.3.1"]
            [jonase/eastwood "0.3.3"]
            [lein-ring "0.9.7"]
            [lein-cljfmt "0.5.7"]
            [test2junit "1.3.3"]]

  :cljfmt {:indents {for-all [[:block 1]]
                     fdef [[:block 1]]
                     checking [[:inner 0]]}})
