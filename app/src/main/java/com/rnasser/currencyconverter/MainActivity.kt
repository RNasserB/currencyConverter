package com.rnasser.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun soma(num1: Int, num2: Int) {
        var somei = num1 + num2
        println(somei)
    }


}