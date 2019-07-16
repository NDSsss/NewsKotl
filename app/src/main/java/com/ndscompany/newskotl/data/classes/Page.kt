package com.ndscompany.newskotl.data.classes

data class Page(
    var `data`: List<Data>,
    var current_page: Int,
    var first_page_url: String,
    var from: Int,
    var last_page: Int,
    var last_page_url: String,
    var next_page_url: String,
    var path: String,
    var per_page: Int,
    var prev_page_url: String,
    var to: Int,
    var total: Int
)