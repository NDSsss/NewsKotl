package com.ndscompany.newskotl.presention.main.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ndscompany.newskotl.R
import com.ndscompany.newskotl.data.classes.Data
import kotlinx.android.synthetic.main.item_news.view.*

class NewsAdapter(val paginationListener:() -> Unit): RecyclerView.Adapter<NewsAdapter.NewsVh>() {

    var newsList:ArrayList<Data> = ArrayList()

    fun addNews(newList:List<Data>){
        newsList.addAll(newList)
        notifyDataSetChanged()
    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsVh {
//        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
//        var newsVh = NewsVh(view)
//        return newsVh
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsVh = NewsVh(LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false))

//    override fun getItemCount(): Int {
//        return newsList.size
//    }
    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: NewsVh, position: Int) {
        holder.itemView.item_news_count.text = newsList[position].id.toString()
        holder.itemView.item_news_title.text = newsList[position].title
        holder.itemView.item_news_description.text = newsList[position].description
        if(position == newsList.size-1){
            paginationListener()
        }
    }

    class NewsVh(itemView: View):RecyclerView.ViewHolder(itemView)
}