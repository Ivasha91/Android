package com.IVAN.myfirstapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

private const val TAG = "MainActivity"
private const val MY_LOG_TAG = "MyLog"

private  const val KEY = "HELLO_KEY"
private const val GET_FILE_REQUEST=1
class MainActivity : AppCompatActivity() {

    private var strNum = 1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MY_LOG_TAG, "Стихотворение:")
        StrChange()


        val nextButton: Button = findViewById(R.id.next_button)

//        переходл и передача данных на вторую активити
        val intent= Intent(this, SecondActivity::class.java)
        intent.putExtra(KEY, "Hello from MainActivity!")

//        открытие любой ссылки
//        val link = Uri.parse("https://odin.study/")
//        val intent = Intent(Intent.ACTION_VIEW, link)

//        открытие файла
//        val intent = Intent(Intent.ACTION_GET_CONTENT)
//        intent.type="file/*"
//        val resultLauncher =
//            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result->
//            if(result.resultCode = RESULT_OK)
//                result.data?.data.toString() // путь к файлу
//                else
//                    Toast.makeText(this, "Ничего не выбрано", Toast.LENGTH_LONG).show()
//            }



        nextButton.setOnClickListener {
//            для открытия файла
//            resultLauncher.launch(intent)

//            для открытия файлов раньше
//            startActivityForResult(intent, GET_FILE_REQUEST)

//            для перехода и ссылок
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        StrChange()
//        Log.d(MY_LOG_TAG, "onStart()")

    }

    override fun onResume() {
        super.onResume()
        StrChange()
//        Log.d(MY_LOG_TAG, "onResume()")
    }

    private fun StrChange (){
        val helloTextView: TextView = findViewById(R.id.hello_text_view)
        var poemStrLink = ""
        helloTextView.textSize = 20f
        when (strNum){
            1 -> poemStrLink = getString(R.string.poem_str_1)
            2 -> poemStrLink = getString(R.string.poem_str_2)
            3 -> poemStrLink = getString(R.string.poem_str_3)
            4 -> poemStrLink = getString(R.string.poem_str_4)
            5 -> poemStrLink = getString(R.string.poem_str_5)
            6 -> poemStrLink = getString(R.string.poem_str_6)
            7 -> poemStrLink = getString(R.string.poem_str_7)
            8 -> poemStrLink = getString(R.string.poem_str_8)
            9 -> poemStrLink = getString(R.string.poem_str_9)
            10 -> poemStrLink = getString(R.string.poem_str_10)
            11 -> poemStrLink = getString(R.string.poem_str_11)
            12 -> poemStrLink = getString(R.string.poem_str_12)
            13 -> poemStrLink = getString(R.string.poem_str_13)
        }
        Log.d(MY_LOG_TAG, poemStrLink)
            if (strNum > 13) {
                strNum = 1
                StrChange ()
            } else{
                strNum++
            }

        helloTextView.text = poemStrLink

    }



    override fun onPause() {
        super.onPause()
        StrChange()
//        Log.d(MY_LOG_TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        StrChange()
//        Log.d(MY_LOG_TAG, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        StrChange()
//        Log.d(MY_LOG_TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        StrChange()
//        Log.d(MY_LOG_TAG, "onDestroy()")
    }

}