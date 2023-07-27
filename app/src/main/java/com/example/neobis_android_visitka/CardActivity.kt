package com.example.neobis_android_visitka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neobis_android_visitka.databinding.ActivityCardBinding


class CardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val position = intent.getStringExtra("position")
        binding.textNameDoctor.text = name
        binding.textPosition.text = position
    }

}