package com.example.coinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }

    fun getUserToken(): String {
        val prefs = getSharedPreferences("UserToken", MODE_PRIVATE)
        // Fetches the token, does a lot of things, then...
        return "theToken";
    }

}

