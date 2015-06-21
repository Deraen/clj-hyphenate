(ns clj-hyphenate.core-test
  (:require [clojure.test :refer :all]
            [clojure.string :as string]
            [clj-hyphenate.core :refer :all]
            [clj-hyphenate.patterns.en-gb :as en]))

; (deftest split-pat-test
;   (is (= [(vec "henat") [0 0 0 5 0 0]] (split-pat "hen5at"))))

; (deftest split-exn-test
;   (is (= [(vec "_table_") [6 6 6 7 6 6 6 6]] (split-exn "ta-ble"))))

(deftest substrings-test
  (is (= ["hello" "ello" "llo" "lo" "o"] (substrings "hello"))))

(deftest substrings2-test
  (is (= [[\e] [\e \l] [\e \l \l] [\e \l \l \o]] (substrings2 "ello"))))

(defn hyphenated [& s]
  (string/join +hyphen+ s))

(deftest hyphenate-word-test
  (is (= (hyphenated "as" "so" "ci" "ate")
         (hyphenate-word en/rules "associate")))
  (is (= (hyphenated "hy" "phen" "ation")
         (hyphenate-word en/rules "hyphenation")))
  (is (= (hyphenated "com" "puter")
         (hyphenate-word en/rules "computer")))
  (is (= (hyphenated "al" "go" "rithm")
         (hyphenate-word en/rules "algorithm")))

  (is (= (hyphenated "let" "ters")
         (hyphenate-word en/rules "letters")))

  (is (= "words"
         (hyphenate-word en/rules "words")))

  (is (= "PANIC"
         (hyphenate-word en/rules "PANIC")))
  (is (= "DON’T"
         (hyphenate-word en/rules "DON’T")))
  )
