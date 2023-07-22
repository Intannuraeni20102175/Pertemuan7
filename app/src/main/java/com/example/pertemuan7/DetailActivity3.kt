package com.example.pertemuan7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan7.databinding.ActivityDetail3Binding

class DetailActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityDetail3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetail3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener {
            val intent = Intent(this,InputDataActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}