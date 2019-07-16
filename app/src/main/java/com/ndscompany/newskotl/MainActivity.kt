package com.ndscompany.newskotl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var example: Example

    var example2: Example = Example("qq")

    var example3 = Example("dg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activity_main_recycler.layoutManager = LinearLayoutManager(this)
        val exEx: Example = Example("dd", "ggh")
        example = Example("dw")
        example3.value = "1"
        example3.value2
        example3.value3
        var q = 1
        Log.d("some tag", "some text ${someInt()} more text")
    }

    fun someInt():Int{
        return 2
    }


    class Example(var value2: String, var value3:String = "rt"){
        var value:String = "0"
        init {
            value = value2 + value3
        }
    }
}
