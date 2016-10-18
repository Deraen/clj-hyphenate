(ns clj-hyphenate.build
  (:require [clojure.java.io :as io]
            [clojure.string :as string]
            [clojure.pprint :as pprint]
            [cheshire.core :as json])
  (:import [java.net URLDecoder]))

(defn indent [n xs]
  (map #(str (if-not (empty? %) (apply str (repeat n " "))) %) xs))

(defn cljize [lang json content]
  (let [docstring (map second (re-seq #"\/\/[ ]?(.*)" content))
        edn (-> json
                (json/parse-string true)
                (update-in [:patterns] #(into {} (map (fn [[k v]] [(Integer/parseInt (name k)) v]) %)))
                (dissoc :patternArrayLength :valueStoreLength))]
    (println (str "(ns clj-hyphenate.patterns." lang ""))
    (println "  \"This pattern is imported from Hyphenator.js. Original comment follows:\n")
    (println (string/join "\n" (indent 3 docstring)) "\"")
    (println "  (:require [clj-hyphenate.patterns :as pat]))")
    (println)
    (println "(def rules'")
    (pprint/pprint edn)
    (println ")")
    (println)
    (println "(def rules")
    (println "  (-> rules'")
    (println "      (assoc :trie (pat/build-trie rules'))")
    (println "      (dissoc :patterns)))")
    ))

(defn build []
  (doseq [f (file-seq (io/file "ext/Hyphenator/patterns"))
          :when (.isFile f)
          :let [lang (string/replace (.getName f) #"\.js$" "")
                json (io/file "tmp" (str lang ".json"))
                target (io/file "src/clj_hyphenate/patterns/" (str (string/replace lang #"-" "_") ".cljc"))]]
    (println lang)
    (spit target
          (with-out-str (cljize lang
                                (slurp json)
                                (slurp f))))))

(defn -main []
  (build))
