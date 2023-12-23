package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    var nameList= ArrayList<String>()
    var imageList=ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView= findViewById(R.id.gridView)

        fillArrays()

        val adapter = AnimalsAdapter(this,nameList,imageList)
        gridView.adapter= adapter

        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(applicationContext, "You selected the ${nameList[position]}",
                Toast.LENGTH_LONG)
                .show()
        }
    }
    fun fillArrays(){
        nameList.add("Dog")
        nameList.add("Cat")
        nameList.add("Bird")
        nameList.add("Panda")
        nameList.add("Monkey")
        nameList.add("Fish")
        nameList.add("Lion")
        nameList.add("Rabbit")
        nameList.add("Pig")

        imageList.add(R.drawable.dog)
        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.bird)
        imageList.add(R.drawable.panda)
        imageList.add(R.drawable.monkey)
        imageList.add(R.drawable.fish)
        imageList.add(R.drawable.lion)
        imageList.add(R.drawable.rabbit)
        imageList.add(R.drawable.pig)
    }
}