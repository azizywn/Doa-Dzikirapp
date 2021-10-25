package com.singaperbangsaluthfiFarizqi.doadandzikir

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // Intent digunakan untuk pindah acticty atau halaman
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

}