'use strict';

var mongoose = require('mongoose');
var schema = mongoose.Schema;

var commentSchema = new schema({
  author:String,
  text:String
});

module.exports = mongoose.model('Comment',commentSchema);
