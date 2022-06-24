package com.example.navegaoentretelas.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navegaoentretelas.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavigationScreen2()
    }

    private fun setupNavigationScreen2() {
        binding.icVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
