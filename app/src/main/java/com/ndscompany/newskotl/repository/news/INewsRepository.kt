package com.ndscompany.newskotl.repository.news

import com.ndscompany.newskotl.data.classes.Data
import com.ndscompany.newskotl.data.classes.Page
import io.reactivex.Observable

interface INewsRepository {
    fun getNews(): Observable<Page>
}