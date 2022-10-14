package com.example.zamin.andoridteam13.mavzular.birinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zamin.andoridteam13.R
import com.example.zamin.andoridteam13.databinding.ActivityBirinchiMasala1Binding

class BirinchiMasala1 : AppCompatActivity() {
    lateinit var binding:ActivityBirinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnHisoblash.setOnClickListener {
                masalaJavobi.text = "P= "+value.text.toString().toInt()*4
            }
        }

    }
}