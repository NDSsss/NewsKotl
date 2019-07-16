package com.ndscompany.newskotl.repository.news

import android.util.AndroidException
import com.ndscompany.newskotl.base.App
import com.ndscompany.newskotl.data.classes.Page
import com.ndscompany.newskotl.network.news.NewsServise
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class NewsRepository: INewsRepository {
    override fun getNews(): Observable<Page> = App.retrofit.create(NewsServise::class.java).getNews(1)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

}