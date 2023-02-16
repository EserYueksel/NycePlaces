package com.example.nyceplaces

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*

class AddNycePlaceActivity : AppCompatActivity(), View.OnClickListener {

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

    // TODO dateSetListener = DatePickerDialog.OnDateSetListener {
    // TODO view, year, month, dayOfMonth ->
    // TODO cal.set(Calendar.YEAR, year)
    // TODO cal.set(Calendar.MONTH, month)
    // TODO cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
    // TODO }

    // TODO et_date.setOnClickListener(this)

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.et_date ->{
                DatePickerDialog(this@AddNycePlaceActivity,
                    dateSetListener,
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
            }
        }
    }
}