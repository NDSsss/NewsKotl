package com.ndscompany.newskotl.repository.news

import android.util.AndroidException
import com.ndscompany.newskotl.base.App
import com.ndscompany.newskotl.data.classes.Page
import com.ndscompany.newskotl.network.news.NewsServise
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class NewsRepository: INewsRepository {
    override fun getNews(pageNumber: Int): Observable<Page> = App.retrofit.create(NewsServise::class.java).getNews(pageNumber)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

}