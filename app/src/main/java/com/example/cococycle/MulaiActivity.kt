package com.example.cococycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MulaiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mulai)

        // Inisialisasi komponen dari XML
        val logoImage: ImageView = findViewById(R.id.logoImage)
        val appName: TextView = findViewById(R.id.appName)
        val startButton: Button = findViewById(R.id.startButton)

        // Aksi ketika tombol "MULAI" ditekan
        startButton.setOnClickListener {
            val intent = Intent(this, MasukActivity::class.java)
            startActivity(intent)
            finish() // Opsional
        }

    }
}
