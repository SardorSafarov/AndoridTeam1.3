package com.example.zamin.andoridteam13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zamin.andoridteam13.databinding.ActivityMainBinding
import com.example.zamin.andoridteam13.mavzular.birinchiMavzu.BirnichiMavzuActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            startActivity(Intent(this,BirnichiMavzuActivity::class.java))
        }
    }
}