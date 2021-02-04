package com.example.greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var editText: EditText? = null
    var textView: TextView? = null

    var message: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)
    }

    fun sendButton(view: View) {
        message = editText!!.text.toString()

        textView!!.text = message
    }
}