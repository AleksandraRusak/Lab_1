package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class LoggedInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)

        val welcomeTextView : TextView = findViewById(R.id.welcome_text_view)

        val displayUsername: TextView = findViewById(R.id.textView_displayUsername) // TextView
        displayUsername.text = intent.getStringExtra("key_username")

        val logOutButton: Button = findViewById(R.id.logOut_button)

        logOutButton.setOnClickListener {
            val logOutIntent = Intent(this, MainActivity::class.java)
            startActivity(logOutIntent)
        }

    }
}
