package com.rnasser.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ScreenDolarReal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_dolar_real)
    }

    var priceDolar = 5.50


    fun converter (firstNumber: Double, secondNumber: Double): Double{
        var resultConverter = firstNumber * priceDolar
        return resultConverter
    }

    ontext

}