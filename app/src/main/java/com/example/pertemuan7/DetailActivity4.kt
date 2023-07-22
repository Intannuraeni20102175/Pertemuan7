package com.example.pertemuan7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan7.databinding.ActivityDetail4Binding

class DetailActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityDetail4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetail4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button4.setOnClickListener {
            val intent = Intent(this,InputDataActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}