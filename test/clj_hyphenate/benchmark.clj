(ns clj-hyphenate.benchmark
  (:require [clj-hyphenate.core :refer :all]
            [clj-hyphenate.patterns.en-us :as en]
            [criterium.core :as b]))

(def s "this is now implemented in Boot-cljs and Boot-reload. I've made a
        screen cast about the new feature so check that to see how it works.
        Read on for some details about the implementation and to see what's
        up next for Boot ClojureScript tooling.")

(b/with-progress-reporting (b/quick-bench (hyphenate-paragraph en/rules s) :verbose))
