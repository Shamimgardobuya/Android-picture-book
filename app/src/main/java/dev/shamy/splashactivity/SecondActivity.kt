package dev.shamy.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var btnPrevious:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnPrevious=findViewById(R.id.btnPrevious)
        btnNext2=findViewById(R.id.btnNext2)

        btnPrevious.setOnClickListener {
            var intent=Intent(this,Firstpage::class.java)
            startActivity(intent)
        }
        btnNext2.setOnClickListener {
            var intent=Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}