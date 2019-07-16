package com.ndscompany.newskotl.network.news

import com.ndscompany.newskotl.data.classes.Page
import io.reactivex.Observable
import retrofit2.http.*

interface NewsServise {
    @POST("get")
    fun getNews(@Query("page") page: Int): Observable<Page>
}