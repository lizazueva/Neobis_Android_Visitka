package com.example.neobis_android_visitka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neobis_android_visitka.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}