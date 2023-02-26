package com.example.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutButton : Button = findViewById(R.id.about_button)
        val signInButton : Button = findViewById(R.id.sign_in_button)

        aboutButton.setOnClickListener {
            val aboutIntent = Intent(this, AboutActivity::class.java)
            startActivity(aboutIntent)
        }

        signInButton.setOnClickListener {
            val signInIntent = Intent(this, SignInActivity::class.java)
            startActivity(signInIntent)
        }
    }
}
