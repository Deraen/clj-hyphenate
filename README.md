# clj-hyphenate [![Circle CI](https://circleci.com/gh/Deraen/clj-hyphenate.svg?style=svg)](https://circleci.com/gh/Deraen/clj-hyphenate) [![codecov.io](http://codecov.io/github/Deraen/clj-hyphenate/coverage.svg?branch=master)](http://codecov.io/github/Deraen/clj-hyphenate?branch=master)

[![Clojars Project](http://clojars.org/deraen/clj-hyphenate/latest-version.svg)](http://clojars.org/deraen/clj-hyphenate)

A Clojure implementation of [Franklin M Liang's hyphenation algorithm][2].
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
"as-so-ciate"
user=> (hyphenate-word en/rules "hyphenation")
"hy-phen-ation"
```

## License

Copyright © 2015 Juho Teperi

Distributed under the MIT License.

Patterns are imported from [Hyphenator.js][1]. Patterns should contain
mention about their original source.

[1]: http://mnater.github.io/Hyphenator/
[2]: http://www.tug.org/docs/liang/
