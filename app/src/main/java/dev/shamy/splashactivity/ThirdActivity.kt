package dev.shamy.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    lateinit var btnPrevious3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnNext3=findViewById(R.id.btnNext3)
        btnPrevious3=findViewById(R.id.btnPrevious3)
        btnPrevious3.setOnClickListener {
            var intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        btnNext3.setOnClickListener {
            var intent=Intent(this,FourthActivity::class.java)
            startActivity(intent)
        }
    }
}