package com.example.nyceplaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.nyceplaces.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fabButton: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        fabButton.fabAddNycePlace.setOnClickListener{
            val intent = Intent(this, AddNycePlaceActivity::class.java)
            startActivity(intent)
        }
    }
}