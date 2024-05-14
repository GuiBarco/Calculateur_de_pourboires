package com.example.davspaceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.davspaceapp.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

            var percentage: Int = 0
            binding.rbOptionOne.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked){
                    percentage = 10
                }
        }
        binding.rbOptionTwo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                percentage = 15
            }
        }
        binding.rbOptionThree.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                percentage = 20
            }
        }

            binding.btnClean.setOnClickListener {
            println("Barco" + binding.tieTotal.text )
            println("Barco" + binding.tieNumPeople.text )
        }
            binding.btnDone.setOnClickListener {
                val totalTable: Float = binding.tieTotal.text.toString().toFloat()
                val nPeople: Int = binding.tieNumPeople.text.toString().toInt()

                val totalTemp = totalTable / nPeople
                val Tips = totalTemp * percentage / 100
                val totalWithTips = totalTemp + Tips
                binding.tvResult.text = "Total with tips: $totalWithTips"


            }
    }
}