package com.thishkt.demointent2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        btn_next_page.setOnClickListener {
            val intent = Intent(this,BActivity::class.java)
            intent.putExtra("book_name0","000 HKT 線上教室")
            intent.putExtra("book_name1","111 HKT 線上教室")
            startActivity(intent)
        }
    }
}
