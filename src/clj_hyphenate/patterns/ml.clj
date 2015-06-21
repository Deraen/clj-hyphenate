(ns clj-hyphenate.patterns.ml
  "This pattern is imported from Hyphenator.js. Original comment follows:

   For questions about the Malayalam hyphenation patterns
   ask Santhosh Thottingal (santhosh dot thottingal at gmail dot com) "
  (:require [clj-hyphenate.patterns :as pat]))

(def rules'
{:leftmin 2,
 :rightmin 2,
 :specialChars
 "അആഇഈഉഊഋൠഌൡഎഏഐഒഓഔാിീുൂൃെേൈൊോൌൗകഖഗഘങചഛജഝഞടഠഡഢണതഥദധനപഫബഭമയരറലളഴവശഷസഹഃം്ൺൻർൽൾൿ‍",
 :patterns
 {2
  "ാ1ി1ീ1ു1ൂ1ൃ1െ1േ1ൈ1ൊ1ോ1ൌ1ൗ11ക1ഖ1ഗ1ഘ1ങ1ച1ഛ1ജ1ഝ1ഞ1ട1ഠ1ഡ1ഢ1ണ1ത1ഥ1ദ1ധ1ന1പ1ഫ1ബ1ഭ1മ1യ1ര1റ1ല1ള1ഴ1വ1ശ1ഷ1സ1ഹ2ൺ2ൻ2ർ2ൽ2ൾ2ൿ",
  3
  "1അ11ആ11ഇ11ഈ11ഉ11ഊ11ഋ11ൠ11ഌ11ൡ11എ11ഏ11ഐ11ഒ11ഓ11ഔ12ഃ12ം12്2ന്2ര്2ള്2ല്2ക്2ണ്2",
  4 "2ന്‍2ര്‍2ല്‍2ള്‍2ണ്‍2ക്‍"},
 :patternChars
 "ംഃഅആഇഈഉഊഋഌഎഏഐഒഓഔകഖഗഘങചഛജഝഞടഠഡഢണതഥദധനപഫബഭമയരറലളഴവശഷസഹാിീുൂൃെേൈൊോൌ്ൗൠൡൺൻർൽൾൿ‍"}
)

(def rules
  (-> rules'
      (assoc :trie (pat/build-trie rules'))
      (dissoc :patterns)))
