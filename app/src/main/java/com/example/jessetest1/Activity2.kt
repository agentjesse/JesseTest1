package com.example.jessetest1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jessetest1.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    //below is for the recent View Binding feature
    private lateinit var bind: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_2)
        //below is for the recent View Binding feature.
        bind = Activity2Binding.inflate(layoutInflater)
        setContentView(bind.root)

        //get string type data from previous activity, access with same name key
        val bundle: Bundle? = intent.extras

        if (bundle!!.getString("playerName")!!.isNotEmpty()){
            bind.welcomePlayerText.text = "Welcome ${bundle.getString("playerName")}, prepare to be amazed"
        }
    }
}