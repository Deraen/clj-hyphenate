(ns clj-hyphenate.core
  (:require [clojure.string :as string]))

(def +hyphen+ (char 173))

(defn substrings [w]
  (map #(.substring w %) (range (count w))))

(defn substrings2 [w]
  (map #(vec (.substring w 0 (inc %))) (range (count w))))

(defn hyphenate-word [{:keys [trie leftmin rightmin] :as rules}
                      word
                      & {:keys [hyphen]
                         :or {hyphen +hyphen+}}]
  {:pre [(char? hyphen) (map? trie)]}
  (cond
    ; If contains non-alphanumeric chars?
    ; (re-find #"[^A-Za-z0-9]" word) word

    ; If already has hyphen
    (>= (.indexOf word (int hyphen)) 0)
    word

    ; If has "-" split and hyphenate parts
    (>= (.indexOf word (int \-)) 0)
    (->> (string/split word #"-")
         (map (partial hyphenate-word rules))
         (string/join "-"))

    :else
    (let [ww (str "_" (string/lower-case word) "_")
          ; TODO: Normalize to NFD
          ss (vec (substrings ww))

          points
          (reduce-kv (fn [points pstart ss]
                       (reduce (fn [points ss2]
                                 (if-let [t (get (get-in trie ss2) nil)]
                                   (reduce-kv (fn [points x p]
                                                (let [c (+ pstart x)
                                                      cp (get points c 0)]
                                                  (if (> p cp)
                                                    (assoc points c p)
                                                    points)))
                                              points
                                              t)
                                   points))
                               points
                               (vec (substrings2 ss))))
                     (vec (repeat (inc (count ww)) 0))
                     ss)]
      (reduce (fn [hw hp]
                (str hw
                     (if (and (<= leftmin hp (- (count word) rightmin)) (not= (mod (get points (inc hp)) 2) 0))
                       hyphen)
                     (get word hp)))
              ""
              (range (count ww))))))

(defn hyphenate-paragraph [rules p]
  (-> p
      (string/split #" ")
      (->> (map (fn [x]
                  (hyphenate-word rules x)))
           (string/join " "))))
