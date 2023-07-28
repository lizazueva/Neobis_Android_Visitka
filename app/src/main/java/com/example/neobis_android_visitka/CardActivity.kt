package com.example.neobis_android_visitka

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
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
        val cardCall: CardView = binding.cardCall
        val cardMap: TextView = binding.textOpenMap
        val cardMail: CardView = binding.cardEmail

        cardCall.setOnClickListener {
            val numberUri = Uri.parse("tel:891033345555")
            val intent = Intent(Intent.ACTION_DIAL, numberUri)
                startActivity(intent)
            }

        cardMap.setOnClickListener {
            val mapUri = Uri.parse("geo:55.751244,37.618423?q=Moscow")
            val intent = Intent(Intent.ACTION_VIEW, mapUri)
            startActivity(intent)
        }

        cardMail.setOnClickListener {
            val mailUri = Uri.parse("mailto: mail@mail.ru")
            val intent = Intent(Intent.ACTION_SENDTO,mailUri)
            startActivity(intent)
        }

    }

}
