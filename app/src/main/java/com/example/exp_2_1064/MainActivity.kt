package com.example.exp_2_1064

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt1: Button = findViewById(R.id.bt1)
        val bt2: Button = findViewById(R.id.bt2)
        val bt3: Button = findViewById(R.id.bt3)
        val bt4: Button = findViewById(R.id.bt4)
        val bt5: Button = findViewById(R.id.bt5)
        val bt6: Button = findViewById(R.id.bt6)
        val bt7: Button = findViewById(R.id.bt7)
        val bt8: Button = findViewById(R.id.bt8)
        val bt9: Button = findViewById(R.id.bt9)
        val bt0: Button = findViewById(R.id.bt0)
        val btdivide: Button = findViewById(R.id.btdivide)
        val btmultiple: Button = findViewById(R.id.btmultiple)
        val btequal: Button = findViewById(R.id.btequal)
        val btdiff: Button = findViewById(R.id.btdiff)
        val btclear: Button = findViewById(R.id.btclear)
        val btadd: Button = findViewById(R.id.btadd)
        var getQ = ""

        val txt1: TextView = findViewById(R.id.txt1)
        val txt2: TextView = findViewById(R.id.txt2)

        bt1.setOnClickListener {
            getQ += "1 "
            txt1.text = getQ
        }

        bt2.setOnClickListener {
            getQ += "2 "
            txt1.text = getQ
        }

        bt3.setOnClickListener {
            getQ += "3 "
            txt1.text = getQ
        }

        bt4.setOnClickListener {
            getQ += "4 "
            txt1.text = getQ
        }

        bt5.setOnClickListener {
            getQ += "5 "
            txt1.text = getQ
        }

        bt6.setOnClickListener {
            getQ += "6 "
            txt1.text = getQ
        }

        bt7.setOnClickListener {
            getQ += "7 "
            txt1.text = getQ
        }

        bt8.setOnClickListener {
            getQ += "8 "
            txt1.text = getQ
        }

        bt9.setOnClickListener {
            getQ += "9 "
            txt1.text = getQ
        }

        bt0.setOnClickListener {
            getQ += "0 "
            txt1.text = getQ
        }

        btdivide.setOnClickListener {
            getQ += "/ "
            txt1.text = getQ
        }

        btmultiple.setOnClickListener {
            getQ += "* "
            txt1.text = getQ
        }

        btadd.setOnClickListener {
            getQ += "+ "
            txt1.text = getQ
        }

        btdiff.setOnClickListener {
            getQ += "- "
            txt1.text = getQ
        }

        btclear.setOnClickListener {
            getQ = ""
            txt1.text = getQ
            txt2.text = ""
        }

        btequal.setOnClickListener {
            // Evaluate the expression
            val parts = getQ.trim().split(" ")
            var result = 0
            var currentNumber = ""
            var operator = '+'

            for (part in parts) {
                when {
                    part == "+" || part == "-" || part == "*" || part == "/" -> {
                        // Process the current number
                        when (operator) {
                            '+' -> result += currentNumber.toInt()
                            '-' -> result -= currentNumber.toInt()
                            '*' -> result *= currentNumber.toInt()
                            '/' -> result /= currentNumber.toInt()
                            else -> result = currentNumber.toInt()
                        }
                        // Update operator and reset currentNumber
                        operator = part[0]
                        currentNumber = ""
                    }
                    else -> {
                        // Append to currentNumber
                        currentNumber += part
                    }
                }
            }

            // Process the last number
            when (operator) {
                '+' -> result += currentNumber.toInt()
                '-' -> result -= currentNumber.toInt()
                '*' -> result *= currentNumber.toInt()
                '/' -> result /= currentNumber.toInt()
                else -> result = currentNumber.toInt()
            }

            txt2.text = result.toString()
        }


    }
}
