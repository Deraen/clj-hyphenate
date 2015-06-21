#!/usr/bin/env node

GLOBAL.Hyphenator = {languages: {}};

var fs = require('fs');

var files = fs.readdirSync('ext/Hyphenator/patterns');
for (var i in files) {
  var f = files[i];
  require('./ext/Hyphenator/patterns/' + f);
}

var langs = GLOBAL.Hyphenator.languages;

for (var lang in langs) {
  fs.writeFileSync('tmp/' + lang + '.json', JSON.stringify(langs[lang]));
}
