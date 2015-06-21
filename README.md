# clj-hyphenate

A Clojure implementation of [Franklin M Liang's hyhpenation algorithm][2].
Patterns are automatically imported from [Hyphenator.js][1].

## Features

- Supports ~~43~~ 3 languages
  - `en-us`, `en-gb`, `fi`
  - Others may work. Some might not work as I left some special handing out.

## Usage

```clj
(require '[clj-hyphenate.core :refer [hyphenate-word]]
         '[clj-hyphenate.patterns.en-us :as en]))

user=> (hyphenate-word en/rules "associate")
"as­so­ciate"
user=> (hyphenate-word en/rules "hyphenation")
"hy­phen­ation"
```

## License

Copyright © 2015 Juho Teperi

Distributed under the MIT License.

Patterns are imported from [Hyphenator.js][1]. Patterns should contain
mention about their original source.

[1]: http://mnater.github.io/Hyphenator/
[2]: http://www.tug.org/docs/liang/
