package com.thishkt.demointent2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_b.*

class BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val intent = getIntent()
        val book_name0 =intent.getStringExtra("book_name0")
        val book_name1 =intent.getStringExtra("book_name1")


        Log.d("BActivity"," book_name0:  $book_name0")
        Log.d("BActivity"," book_name1:  $book_name1")


        btn_back.setOnClickListener {
            finish()
        }
    }
}
