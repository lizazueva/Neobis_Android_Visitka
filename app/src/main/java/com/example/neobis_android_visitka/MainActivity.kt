package com.example.neobis_android_visitka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.neobis_android_visitka.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var doctors: List<Doctors>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

          doctors = listOf(
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

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        doctors.forEachIndexed { index, doctor ->
            outState.putString("DOCTOR_NAME_$index", doctor.name)
        }
        doctors.forEachIndexed { index, doctor ->
            outState.putString("POSITION_$index", doctor.position)
        }

        }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        doctors.forEachIndexed { index, doctor ->
            doctor.name = savedInstanceState.getString("DOCTOR_NAME_$index", "")
        }
        doctors.forEachIndexed { index, doctor ->
            doctor.position = savedInstanceState.getString("POSITION_$index", "")
        }
    }
}
