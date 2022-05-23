package dev.shamy.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthActivity : AppCompatActivity() {
    lateinit var btnPrevious4:Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        btnNext4=findViewById(R.id.btnNext4)
        btnPrevious4=findViewById(R.id.btnPrevious4)
        btnPrevious4.setOnClickListener {
            var intent=Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
        btnNext4.setOnClickListener {
            var intent=Intent(this,FifthActivity::class.java)
            startActivity(intent)
        }
    }
}