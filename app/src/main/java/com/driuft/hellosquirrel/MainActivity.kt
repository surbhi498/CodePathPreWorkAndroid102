package com.driuft.hellosquirrel

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources


class MainActivity : AppCompatActivity() {

    private lateinit var profileImage: ImageView
    private lateinit var profileName: TextView
    private lateinit var profileBio: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
//        val profileName = findViewById<TextView>(R.id.profile_name)
//
//        // Set the text for the TextView dynamically
//        profileName.text = "Your Text Here"
        button.setOnClickListener { Log.v("hello world" , "Button Clicked!")
            Toast.makeText(this, "Hello To You", LENGTH_SHORT).show()
        }



    }




}