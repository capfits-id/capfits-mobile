package com.ayamgorengenak.capfits.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayamgorengenak.capfits.databinding.ActivityDaftarBinding

class DaftarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDaftarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaftarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            Intent(this@DaftarActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}