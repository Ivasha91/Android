package com.IVAN.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

private  const val KEY = "HELLO_KEY"

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        вывод полученного текста
//        var hello: String? = intent.extras?.getString(KEY)
//        Toast.makeText(this,hello, Toast.LENGTH_LONG).show()

    }
}