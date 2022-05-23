package dev.shamy.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FifthActivity : AppCompatActivity() {
    lateinit var btnPrevious5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        btnPrevious5=findViewById(R.id.btnPrevious5)
        btnPrevious5.setOnClickListener {
            var intent=Intent(this,FourthActivity::class.java)
            startActivity(intent)
        }
    }
}