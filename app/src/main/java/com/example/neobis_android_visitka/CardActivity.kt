package com.example.neobis_android_visitka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neobis_android_visitka.databinding.CardViewBinding

class CardActivity : AppCompatActivity() {

    private lateinit var binding: CardViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CardViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}