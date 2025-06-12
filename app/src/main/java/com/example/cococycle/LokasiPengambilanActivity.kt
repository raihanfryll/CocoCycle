package com.example.cococycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LokasiPengambilanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lokasi) // pastikan file XML-nya bernama lokasi.xml

        val btnKonfirmasi = findViewById<Button>(R.id.btnKonfirmasi)

        btnKonfirmasi.setOnClickListener {
            Toast.makeText(this, "Pengambilan dikonfirmasi!", Toast.LENGTH_SHORT).show()

            // Pindah ke halaman Detail Transaksi
            val intent = Intent(this, DetailTransaksiActivity::class.java)
            startActivity(intent)
        }
    }
}
