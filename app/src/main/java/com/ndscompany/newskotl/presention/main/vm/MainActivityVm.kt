package com.ndscompany.newskotl.presention.main.vm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ndscompany.newskotl.data.classes.Data
import com.ndscompany.newskotl.data.classes.Page
import com.ndscompany.newskotl.repository.news.INewsRepository
import com.ndscompany.newskotl.repository.news.NewsRepository
import com.ndscompany.newskotl.repository.news.NewsRepositoryMock
import com.ndscompany.newskotl.repository.news.TAG_NEWS
import io.reactivex.disposables.CompositeDisposable

class MainActivityVm : ViewModel() {
    val newsList = MutableLiveData<List<Data>>()

    init {
        newsList.value = ArrayList()
    }

    val compositeDisposable = CompositeDisposable()

    var repository: INewsRepository = NewsRepository()

    fun notifyActivityCreated() {
        Log.d(TAG_NEWS, "activityCreated")
        compositeDisposable.add(repository.getNews().subscribe({
            newsList.value = it.data }, {}))
    }

    fun newsReceived(page: Page) {
        val list = page.data
        Log.d(TAG_NEWS, "vm page received ${list.size}")
    }

    fun onDestroy() {
        compositeDisposable.clear()
    }
}