(ns clj-hyphenate.patterns.hi
  "This pattern is imported from Hyphenator.js. Original comment follows:

   For questions about the Hindi hyphenation patterns
   ask Santhosh Thottingal (santhosh dot thottingal at gmail dot com) "
  (:require [clj-hyphenate.patterns :as pat]))

(def rules'
{:leftmin 2,
 :rightmin 2,
 :specialChars
 "आअइईउऊऋऎएऐऒऔकगखघङचछजझञटठडढणतथदधनपफबभमयरलवशषसहळऴऱिीाुूृॆेॊाोैौ्ःं‍",
 :patterns
 {2
  "अ1आ1इ1ई1उ1ऊ1ऋ1ऎ1ए1ऐ1ऒ1औ1ि1ा1ी1ु1ू1ृ1ॆ1े1ॊ1ो1ौ1्2ः1ं11क1ग1ख1घ1ङ1च1छ1ज1झ1ञ1ट1ठ1ड1ढ1ण1त1थ1द1ध1न1प1फ1ब1भ1म1य1र1ल1व1श1ष1स1ह1ळ1ऴ1ऱ"},
 :patternChars
 "ंःअआइईउऊऋऎएऐऒऔकखगघङचछजझञटठडढणतथदधनपफबभमयरऱलळऴवशषसहािीुूृॆेॊोौ्"}
)

(def rules
  (-> rules'
      (assoc :trie (pat/build-trie rules'))
      (dissoc :patterns)))
