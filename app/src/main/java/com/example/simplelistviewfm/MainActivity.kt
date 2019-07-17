package com.example.simplelistviewfm

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var listview:ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listview=findViewById(R.id.listview)

        val res: Resources =resources
        val array=res.getStringArray(R.array.alphabet)

        val adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array)

        listview.adapter=adapter

        listview.onItemClickListener= AdapterView.OnItemClickListener { p0, p1, p2, p3 ->
            val item= listview.getItemAtPosition(p2)
            Toast.makeText(this@MainActivity,item.toString(),Toast.LENGTH_LONG).show()
        }


    }
}
