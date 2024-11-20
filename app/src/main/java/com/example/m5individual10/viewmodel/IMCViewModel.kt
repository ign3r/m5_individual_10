package com.example.m5individual10.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.text.DecimalFormat

class IMCViewModel : ViewModel() {



    // Cálculo del IMC
    fun calcularIMC(peso:String, altura : String) : String{

            var imc = 0.0

            if (altura.toDouble() > 0) {
                var imc = (peso.toDouble() /(alturaAcm(altura.toDouble()) * (alturaAcm(altura.toDouble()))))
                val dec = DecimalFormat("#.##")
                var imcString:String
                imcString = dec.format(imc)
                return imcString
            } else {
                return 0.0.toString()
        }
    }

    private fun alturaAcm(altura:Double):Double{
        val alturacm =(altura/100)
        return alturacm
    }
}
