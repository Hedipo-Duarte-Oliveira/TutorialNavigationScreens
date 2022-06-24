package com.example.navegaoentretelas.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navegaoentretelas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // Função chamada no oncreat
        setupNavigationScreens()
    }
    private fun setupNavigationScreens() { // Criando evento de click para meu botão ele está ouvindo o evento
        binding.icNavegar.setOnClickListener {
            val intent = Intent(this, SegundaTela::class.java) // criando intenção para navegar segunda tela
            startActivity(intent)  // Atividade atual minha man activiticy, e a tela que vou navegar
        }
    }
}
