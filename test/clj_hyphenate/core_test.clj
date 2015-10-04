(ns clj-hyphenate.core-test
  (:require [clojure.test :refer :all]
            [clojure.string :as string]
            [clj-hyphenate.core :refer :all]
            [clj-hyphenate.patterns :refer :all]
            [clj-hyphenate.patterns.en-us :as en]))

(deftest split-pat-test
  (is (= [(vec "henat") [0 0 0 5]] (split-pat "hen5at")))
  (is (= [(vec "abcd") [0 1 0 3 4]] (split-pat "a1bc3d4")))
  (is (= [(vec "xq") [0 1]] (split-pat "x1q"))))

(deftest split-exn-test
  (is (= [(vec "_table_") [6 6 6 7 6 6 6 6]] (split-exn "ta-ble"))))

(deftest substrings-test
  (is (= [[0 "h"] [0 "he"] [0 "hel"] [0 "hell"] [0 "hello"]
          [1 "e"] [1 "el"] [1 "ell"] [1 "ello"]
          [2 "l"] [2 "ll"] [2 "llo"]
          [3 "l"] [3 "lo"]
          [4 "o"]]
         (substrings "hello"))))

(deftest update-points-test
  (is (= [0 0 2 0] (update-points [0 0 0 0] 1 [0 2]))))

(deftest limit-points-test
  (is (= [0 1 1 0 0] (limit-points 2 2 [1 1 1 1 1]))))

(deftest join-words-test
  (is (= ["As" "so" "ci" "ate"]
         (split-word "Associate" [0 1 2 1 2 3 4 0 0]))))

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

  (is (= (hyphenated "pat" "tern")
         (hyphenate-word en/rules "pattern")))

  (is (= "words"
         (hyphenate-word en/rules "words")))

  (is (= "PANIC"
         (hyphenate-word en/rules "PANIC")))
  (is (= "DON’T"
         (hyphenate-word en/rules "DON’T")))
  )
