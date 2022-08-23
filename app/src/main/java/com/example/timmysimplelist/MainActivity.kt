package com.example.timmysimplelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ListView= findViewById<ListView>(R.id.listView)
        val latenames= arrayOf("Florentina Shake", "Sandra", "Timmy Onduso")
        val arrayAdater:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,latenames)
        ListView.adapter=arrayAdater
        ListView.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this,"You have clicked on "+latenames[position],Toast.LENGTH_LONG).show()
        }
    }
}