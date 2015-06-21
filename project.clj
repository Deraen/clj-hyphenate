(defproject clj-hyphenate "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:source-paths ["dev-src"]
                   :dependencies [[cheshire "5.5.0"]]}
             :build {:main clj-hyphenate.build}}
  :aliases {"build" ["with-profile" "+build" "run"]})
