package com.example.nbascore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.widget.Button
import com.example.nbascore.SelectSeasonDialogFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val selectBtn = findViewById<Button>(R.id.select_btn) as Button
        selectBtn.setOnClickListener {
            val dialog : DialogFragment  = SelectSeasonDialogFragment().newInstance()
            dialog.show(supportFragmentManager,"tag")
        }
    }
}
