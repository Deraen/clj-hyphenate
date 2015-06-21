(ns clj-hyphenate.core
  (:require [clojure.string :as string]))

(def +hyphen+ (char 173))

(defn substrings
  "Retun all substring of a word. Returns collection of tuples
   of start index and the substring."
  [w]
  (let [w-len (count w)]
    (mapcat
      (fn [i]
        (map (fn [j]
               [i (.substring w i (+ i j 1))])
             (range (- w-len i))))
      (range w-len))))

(defn update-points
  "Return updated points vector where larger numbers from p are
   merged into p. Merge starts from pstart.

   e.g.
     [0 0 1 1], points
         [2 0], p, pstart 2
   = [0 0 2 1], result"
  [points pstart p]
  (vec (concat (take pstart points)
               (map max (drop pstart points) p)
               (drop (+ pstart (count p)) points))))

(defn limit-points [leftmin rightmin points]
  ; leftmin is decremented because p part of tuple tells if the word should be
  ; split AFTER the character.
  (concat (repeat (dec leftmin) 0)
          (->> points (take (- (count points) rightmin)) (drop (dec leftmin)))
          (repeat rightmin 0)))

(defn split-word [word points]
  ; Points vector has two extras on the start and one at end
  (loop [ws (map vector word points)
         rs (list)
         os (list)]
    (cond
      (empty? ws) (map (partial apply str) (reverse (cons (reverse os) rs)))

      (not= (mod (second (first ws)) 2) 0) (recur (rest ws) (cons (reverse (cons (ffirst ws) os)) rs) (list))

      :else (recur (rest ws) rs (cons (ffirst ws) os)))))

(defn hyphenate-word [{:keys [leftmin rightmin trie] :as rules}
                      word
                      & {:keys [hyphen]
                         :or {hyphen +hyphen+}}]
  {:pre [(char? hyphen) (map? trie)]}
  (cond
    ; If already has (soft-)hyphen
    (>= (.indexOf word (int hyphen)) 0)
    word

    ; If has "-" split then hyphenate parts
    (>= (.indexOf word (int \-)) 0)
    (->> (string/split word #"-")
         (map (partial hyphenate-word rules))
         (string/join "-"))

    :else
    (let [ww     (str "_" (string/lower-case word) "_")
          points
          (reduce
            (fn [points [pstart ss]]
              (if-let [hp (get (get-in trie (seq ss)) nil)]
                (update-points points pstart hp)
                points))
            (vec (repeat (inc (count ww)) 0))
            (substrings ww))]
      ; First two and last item in points are padding
      (->> points
           (drop 2)
           butlast
           (limit-points leftmin rightmin)
           (split-word word)
           (string/join hyphen)))))

(defn hyphenate-paragraph [rules p]
  (->> (string/split p #" ")
       (map (partial hyphenate-word rules))
       (string/join " ")))
