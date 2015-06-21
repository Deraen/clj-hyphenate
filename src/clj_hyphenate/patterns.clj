(ns clj-hyphenate.patterns
  (:require [clojure.string :as string]))

(defn ascii-to-num [x]
  (- (int x) (int \0)))

(defn split-pat [pat]
  [(vec (string/replace pat #"[0-9]" ""))
   (mapv ascii-to-num (string/replace pat #"[_a-z]" "0"))])

(defn split-exn [exn]
  (let [exn (str "_" exn "_")]
    [(vec (string/replace exn #"-" ""))
     (-> exn
         (string/replace #"-" "7")
         (string/replace #"[_a-z]" "6")
         (->> (mapv ascii-to-num)))]))
(defn partition-patterns
  "Takes map of pattern-len & pattern-str and returns a collection
   of patterns"
  [patterns]
  (mapcat (fn [[len patterns]]
            (map #(apply str %) (partition len patterns)))
          patterns))

(defn add-to-trie [trie split-patterns]
  (reduce (fn [trie [ks ps]]
            (update-in trie ks assoc nil ps))
          trie
          split-patterns))

(defn build-trie [rule']
  (-> {}
      (add-to-trie (map split-pat (partition-patterns (:patterns rule'))))))
