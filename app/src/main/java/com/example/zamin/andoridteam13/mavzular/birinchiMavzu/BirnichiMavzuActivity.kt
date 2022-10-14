package com.example.zamin.andoridteam13.mavzular.birinchiMavzu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zamin.andoridteam13.R
import com.example.zamin.andoridteam13.databinding.ActivityBirnichiMavzuBinding
import com.example.zamin.andoridteam13.mavzular.birinchiMavzu.masalalar.BirinchiMasala1

class BirnichiMavzuActivity : AppCompatActivity() {
    lateinit var binding: ActivityBirnichiMavzuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirnichiMavzuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, BirinchiMasala1::class.java))
        }
    }
}