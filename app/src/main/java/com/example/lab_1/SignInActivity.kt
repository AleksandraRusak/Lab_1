package com.example.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class User ( var name: String , var password: String )
class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        val inputUsername: EditText = findViewById(R.id.usernameEditText)
        val inputPassword: EditText = findViewById(R.id.passwordEditText)
        val signInButton: Button = findViewById(R.id.signInButton)
        val invalidUsernamePassword: TextView = findViewById(R.id.invalidUsernamePassword)

        //textView invisible until the user writes incorrect name/password
        invalidUsernamePassword.isVisible = false

        //Arraylist of Users
        var users =
            arrayOf(
                User("Aleksandra","STI2022"),
                User("Marry", "1954"),
                User("Benny", "banana"),
            )

        signInButton.setOnClickListener {

            val username: String = inputUsername.text.toString()

            val password: String = inputPassword.text.toString()

            //Checking threw the list of Users
            for (user: User in users) {
                if (user.name == username && user.password == password) {

                    val loggedInIntent = Intent(this, LoggedInActivity().javaClass).apply {
                        putExtra("key_username", inputUsername.text.toString())
                    }
                    startActivity(loggedInIntent)
                    break

                } else {

                    invalidUsernamePassword.isVisible = true

                }

            }
        }
    }
}



