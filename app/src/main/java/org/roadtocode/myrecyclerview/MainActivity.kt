package org.roadtocode.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val users = ArrayList<User>()
        users.add(User("Nomesh", "8554646545", 2))
        users.add(User("Aniket", "5656615454", 1))
        users.add(User("Gunjan", "896464646", 3))
        users.add(User("Mohini", "8858522", 3))
        users.add(User("Aditya", "932623232", 1))
        users.add(User("Kanchan", "896464646", 2))
        users.add(User("Nakul", "4444444444", 1))
        users.add(User("Nidhi", "896464646", 1))
        users.add(User("Prajakta", "7777777777", 2))
        users.add(User("Sadanand", "896464646", 3))
        users.add(User("Sarvesh", "33333333333", 1))
        users.add(User("Shivam", "896464646", 2))



        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter

    }
}