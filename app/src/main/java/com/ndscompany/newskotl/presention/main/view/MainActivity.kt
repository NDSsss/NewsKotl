package com.ndscompany.newskotl.presention.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.ndscompany.newskotl.R
import com.ndscompany.newskotl.data.classes.Data
import com.ndscompany.newskotl.presention.main.vm.MainActivityVm
import com.ndscompany.newskotl.repository.news.TAG_NEWS
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val vm: MainActivityVm by lazy {
        ViewModelProviders.of(this).get(MainActivityVm::class.java)
    }

    private val observer = Observer<List<Data>>{
        addNews(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activity_main_recycler.layoutManager = LinearLayoutManager(this)
        activity_main_recycler.adapter = NewsAdapter()
        vm.newsList.observe(this, observer)
        vm.notifyActivityCreated()
    }

    fun addNews(newList: List<Data>){
        Log.d(TAG_NEWS, "activityReceived ${newList.size}")
        (activity_main_recycler.adapter as NewsAdapter).addNews(newList)
    }

    override fun onDestroy() {
        vm.onDestroy()
        super.onDestroy()
    }
}
