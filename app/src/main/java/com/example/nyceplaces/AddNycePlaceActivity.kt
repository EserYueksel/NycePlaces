package com.example.nyceplaces

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class AddNycePlaceActivity : AppCompatActivity() {

    private var cal = Calendar.getInstance()
    private lateinit var dateSetListener: DatePickerDialog.OnDateSetListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_nyce_place)

        setSupportActionBar(findViewById(R.id.toolbar_add_place))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // TODO toolbar_add_place.setNavigationOnClickListener {
        // TODO onBackPressed()
        // TODO }
    }
}