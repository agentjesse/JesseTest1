package com.example.jessetest1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
//below is for View Binding feature
import com.example.jessetest1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //below is for the recent View Binding feature
    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //below is for the recent View Binding feature
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        //this button 'yells' at user with a toast.
        bind.yellBtn.setOnClickListener {
            //Log.i("Main Activity .yellBtn","aaaahhhhhHHHH!")
            //show a short toast message
            Toast.makeText(this, "aaaahhhhhHHHH!", Toast.LENGTH_SHORT).show()
        }

        //handle moving to next activity while passing on the player's name
        bind.enterDreamlandBtn.setOnClickListener {
        //log player's name from the playerNameText EditText element
        //Log.i("Main Activity's .playerNameText EditText element", bind.playerNameText.text.toString() )

        //navigate to Activity2 and send some data from this activity to there
        val intent = Intent(this,Activity2::class.java)
        intent.putExtra("playerName",bind.playerNameText.text.toString())
        startActivity(intent)

        }

    }
}
