package com.example.neobis_android_visitka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neobis_android_visitka.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         val doctors = listOf(
            Doctors(binding.NovikovCard, "Dr.Novikov", "Dentist"),
            Doctors(binding.NurmatovCard, "Dr. Nurmatov", "Sanitarian"),
            Doctors(binding.KhailovaCard, "Dr. Khailova", "Sanitarian"),
            Doctors(binding.AlievaCard, "Dr. Alieva", "Surgeon"),
            Doctors(binding.KolesovaCard, "Dr. Kolesova", "Orthodontist"),
        )

        doctors.forEach { item ->
            item.id.setOnClickListener{
                newIntent(item)
            }
        }
    }

     fun newIntent(doctor:Doctors){
        val intent = Intent(this@MainActivity, CardActivity::class.java)
         intent.putExtra("name", doctor.name)
         intent.putExtra("position", doctor.position)
        startActivity(intent)

    }

}