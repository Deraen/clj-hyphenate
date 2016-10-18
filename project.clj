(defproject deraen/clj-hyphenate "0.1.0"
  :description "Implementation of Franklin M Ling's hyphnenation algorithm"
  :url "https://github.com/Deraen/clj-hyphenate"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:source-paths ["dev-src"]
                   :plugins [[lein-cloverage "1.0.6"]
                             [lein-test-out "0.3.1"]]
                   :dependencies [[cheshire "5.5.0"]
                                  [criterium "0.4.3"]]}
             :build {:main clj-hyphenate.build}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0-alpha11"]]}}
  :aliases {"build" ["with-profile" "+build" "run"]
            "all" ["with-profile" "dev:dev,1.7:dev,1.9"]})
