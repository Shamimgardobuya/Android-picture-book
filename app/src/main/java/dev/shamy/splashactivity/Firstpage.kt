package dev.shamy.splashactivity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Firstpage : AppCompatActivity() {
    lateinit var btnMainpg:Button
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)
        btnNext1=findViewById(R.id.btnNext1)
        btnMainpg=findViewById(R.id.btnMainPg)
        btnNext1.setOnClickListener {
            var intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        btnMainpg.setOnClickListener {
            var intent=Intent(this,MM::class.java)
            startActivity(intent)
        }
    }
}