package com.developer.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expression: TextView = findViewById(R.id.expression)
        val resultHolder: TextView = findViewById(R.id.resultHolder)

        val cBtn: Button = findViewById(R.id.cBtn)
        val addSubBtn: Button = findViewById(R.id.addSubBtn)
        val modBtn: Button = findViewById(R.id.modBtn)
        val divideBtn: Button = findViewById(R.id.divideBtn)
        val sevenBtn: Button = findViewById(R.id.sevenBtn)
        val eightBtn: Button = findViewById(R.id.eightBtn)
        val nineBtn: Button = findViewById(R.id.nineBtn)
        val multiBtn: Button = findViewById(R.id.multiBtn)
        val fourBtn: Button = findViewById(R.id.fourBtn)
        val fiveBtn: Button = findViewById(R.id.fiveBtn)
        val sixBtn: Button = findViewById(R.id.sixBtn)
        val subBtn: Button = findViewById(R.id.subBtn)
        val oneBtn: Button = findViewById(R.id.oneBtn)
        val twoBtn: Button = findViewById(R.id.twoBtn)
        val threeBtn: Button = findViewById(R.id.threeBtn)
        val sumBtn: Button = findViewById(R.id.sumBtn)
        val dotBtn: Button = findViewById(R.id.dotBtn)
        val zeroBtn: Button = findViewById(R.id.zeroBtn)
        val delBtn: Button = findViewById(R.id.delBtn)
        val equalBtn: Button = findViewById(R.id.equalBtn)

        cBtn.setOnClickListener {
            expression.text = ""
            resultHolder.text = ""
        }

        delBtn.setOnClickListener{
            expression.text = expression.text.toString().dropLast(1)
            resultHolder.text = ""
        }

        // number
        zeroBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("0")
        }
        oneBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("1")
        }
        twoBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("2")
        }
        threeBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("3")
        }
        fourBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("4")
        }
        fiveBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("5")
        }
        sixBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("6")
        }
        sevenBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("7")
        }
        eightBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("8")
        }
        nineBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("9")
        }

        //operator
        sumBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("+")
        }
        subBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("-")
        }
        multiBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("×")
        }
        divideBtn.setOnClickListener{
            expression.text = expression.text.toString().plus("÷")
        }
//        modBtn.setOnClickListener{
//            expression.text = expression.text.toString().plus(" mod ")
//        }
        equalBtn.setOnClickListener{
            val str = expression.text.toString()
                if (str.contains("+")) {
                    val strs = str.split("+")
                    val result = strs[0].toInt() + strs[1].toInt()
                    resultHolder.text = result.toString()
                }
            if (str.contains("-")) {
                    val strs = str.split("-")
                    val result = strs[0].toInt() - strs[1].toInt()
                    resultHolder.text = result.toString()
                }
            if (str.contains("×")) {
                    val strs = str.split("×")
                    val result = strs[0].toInt() * strs[1].toInt()
                    resultHolder.text = result.toString()
                }
            if (str.contains("÷")) {
                    val strs = str.split("÷")
                    val result = strs[0].toInt() / strs[1].toInt()
                    resultHolder.text = result.toString()
                }
        }
    }
}