package com.example.multipageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multipageapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(
            binding.root
        )

        val data = intent.getStringExtra("name")

        binding.tv.text = data

    }
}