package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity :AppCompatActivity(),View.OnClickListener{
    private lateinit var edtWidth:EditText
    private lateinit var edtHeight:EditText
    private lateinit var edtLength:EditText
    private lateinit var btnCalculate:Button
    private lateinit var tvResult:TextView

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_main)
        
        edtWidth=findViewById(R.id.edt_Width)
        edtHeight=findViewById(R.id.edt_Height)
        edtLength=findViewById(R.id.edt_Lenght)
        btnCalculate=findViewById(R.id.btn_calculate)
        tvResult=findViewById(R.id.tv_result)
        
        btnCalculate.setOnClickListener(this)
        
    }

    override fun onClick(v: View) {
        if(v.id == R.id.btn_calculate){
            val inputLength=edtLength.text.toString().trim()
            val inputWidth=edtWidth.text.toString().trim()
            val inputHeight=edtHeight.text.toString().trim()

            val volume =inputLength.toDouble()*inputWidth.toDouble()*inputHeight.toDouble()
            tvResult.text=volume.toString()
        }
    }
}