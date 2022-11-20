package com.example.basic_form_kt

import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val policy = ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        var messagePlainTxt = findViewById(R.id.messagePlainTxt) as EditText
        var submitBtn = findViewById(R.id.submitBtn) as Button

        submitBtn.setOnClickListener {
            Toast.makeText(this, messagePlainTxt.getText().toString(), Toast.LENGTH_SHORT).show()
            messagePlainTxt.setText("")
        }
    }
}