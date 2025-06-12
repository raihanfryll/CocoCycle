package com.example.cococycle

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EcoMarketplaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ecomarketplace)

        // Tombol back
        val backButton = findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }

        // Produk kategori (kerajinan, arang, tanaman)
        val produk1 = findViewById<ImageView>(R.id.produk1)
        produk1?.setOnClickListener {
            Toast.makeText(this, "Kerajinan dari Sabut Kelapa", Toast.LENGTH_SHORT).show()
        }

        val produk2 = findViewById<ImageView>(R.id.produk2)
        produk2?.setOnClickListener {
            Toast.makeText(this, "Arang Aktif dari Tempurung", Toast.LENGTH_SHORT).show()
        }

        val produk3 = findViewById<ImageView>(R.id.produk3)
        produk3?.setOnClickListener {
            Toast.makeText(this, "Pot Tanaman dari Kelapa", Toast.LENGTH_SHORT).show()
        }

        // Tombol tambah (pastikan ID-nya cocok dengan di layout)
        val tambahButton = findViewById<ImageView>(R.id.imgTambah)
        tambahButton.setOnClickListener {
            val intent = Intent(this, TambahBatokKelapaActivity::class.java)
            startActivity(intent)
        }
    }
}
