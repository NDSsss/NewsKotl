package com.ndscompany.newskotl.repository.news

import android.util.Log
import com.google.gson.Gson
import com.ndscompany.newskotl.data.classes.Data
import com.ndscompany.newskotl.data.classes.Page
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.*


const val TAG_NEWS = "NewsTag"

class NewsRepositoryMock: INewsRepository {

    override fun getNews(pageNumber: Int): Observable<Page> = Observable.just(getMockNews())
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

    private fun getMockNews(): Page {
        var newsPage = Gson().fromJson(newsAnswer, Page::class.java)
        Log.d(TAG_NEWS, "page created ${newsPage.data.size}")
        return newsPage
    }

    private val newsAnswer = "{\n" +
            "    \"current_page\": 2,\n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"title\": \"1ZnvLNa26t\",\n" +
            "            \"description\": \"LbFe5vWYbQprPceQ6rY9\",\n" +
            "            \"created_at\": \"2019-07-11 11:41:22\",\n" +
            "            \"updated_at\": \"2019-07-11 11:41:22\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"first_page_url\": \"http://test.qqmf.ru/news/get?page=1\",\n" +
            "    \"from\": 6,\n" +
            "    \"last_page\": 199,\n" +
            "    \"last_page_url\": \"http://test.qqmf.ru/news/get?page=199\",\n" +
            "    \"next_page_url\": \"http://test.qqmf.ru/news/get?page=3\",\n" +
            "    \"path\": \"http://test.qqmf.ru/news/get\",\n" +
            "    \"per_page\": 5,\n" +
            "    \"prev_page_url\": \"http://test.qqmf.ru/news/get?page=1\",\n" +
            "    \"to\": 10,\n" +
            "    \"total\": 995\n" +
            "}"
}