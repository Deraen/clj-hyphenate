(ns clj-hyphenate.core-test
  (:require [clojure.test :refer :all]
            [clojure.string :as string]
            [clj-hyphenate.core :refer :all]))

(deftest split-pat-test
  (is (= [(vec "henat") [0 0 0 5 0 0]] (split-pat "hen5at"))))

(deftest split-exn-test
  (is (= [(vec "_table_") [6 6 6 7 6 6 6 6]] (split-exn "ta-ble"))))

(deftest substrings-test
  (is (= ["hello" "ello" "llo" "lo" "o"] (substrings "hello"))))

(deftest substrings2-test
  (is (= [[\e] [\e \l] [\e \l \l] [\e \l \l \o]] (substrings2 "ello"))))

(defn hyphenated [& s]
  (string/join +hyphen+ s))

(deftest hyphenate-word-test
  (is (= (hyphenated "as" "so" "ci" "ate")
         (hyphenate-word "associate")))
  (is (= (hyphenated "hy" "phen" "ation")
         (hyphenate-word "hyphenation")))
  (is (= (hyphenated "com" "puter")
         (hyphenate-word "computer")))
  (is (= (hyphenated "al" "go" "rithm")
         (hyphenate-word "algorithm"))))
