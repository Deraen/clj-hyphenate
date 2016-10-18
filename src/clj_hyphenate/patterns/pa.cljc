(ns clj-hyphenate.patterns.pa
  "This pattern is imported from Hyphenator.js. Original comment follows:

   For questions about the Panjabi hyphenation patterns
   ask Santhosh Thottingal (santhosh dot thottingal at gmail dot com) "
  (:require [clj-hyphenate.patterns :as pat]))

(def rules'
{:leftmin 2,
 :rightmin 2,
 :specialChars
 "ਆਅਇਈਉਊਏਐਔਕਗਖਘਙਚਛਜਝਞਟਠਡਢਣਤਥਦਧਨਪਫਬਭਮਯਰਲਵਸ਼ਸਹਲ਼ਿੀਾੁੂੇਾੋੈੌ੍ਃਂ‍",
 :patterns
 {2
  "ਅ1ਆ1ਇ1ਈ1ਉ1ਊ1ਏ1ਐ1ਔ1ਿ1ਾ1ੀ1ੁ1ੂ1ੇ1ੋ1ੌ1੍2ਃ1ਂ11ਕ1ਗ1ਖ1ਘ1ਙ1ਚ1ਛ1ਜ1ਝ1ਞ1ਟ1ਠ1ਡ1ਢ1ਣ1ਤ1ਥ1ਦ1ਧ1ਨ1ਪ1ਫ1ਬ1ਭ1ਮ1ਯ1ਰ1ਲ1ਵ1ਸ਼1ਸ1ਹ1ਲ਼"},
 :patternChars "ਂਃਅਆਇਈਉਊਏਐਔਕਖਗਘਙਚਛਜਝਞਟਠਡਢਣਤਥਦਧਨਪਫਬਭਮਯਰਲਲ਼ਵਸ਼ਸਹਾਿੀੁੂੇੋੌ੍"}
)

(def rules
  (-> rules'
      (assoc :trie (pat/build-trie rules'))
      (dissoc :patterns)))
