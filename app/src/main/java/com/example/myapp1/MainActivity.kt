@file:Suppress("IMPLICIT_CAST_TO_ANY")

package com.example.myapp1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity<text> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(/* layoutResID = */ com.example.myapp1.R.layout.activity_main)


        val editText1 = findViewById<EditText>(R.id.Text1)
        val editText2 = findViewById<EditText>(R.id.text22)
        val buttonComparar = findViewById<Button>(R.id.buttonComparar)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonComparar.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()
            val result = if (text1.equals(text2, ignoreCase = true)) "Los textos son iguales" else "Los textos son diferentes"
            textViewResult.text = result
        }
    }
        }






