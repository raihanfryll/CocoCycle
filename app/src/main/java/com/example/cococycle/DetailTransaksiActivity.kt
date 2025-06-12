package com.example.cococycle


import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.cococycle.DashboardActivity
import com.example.cococycle.R

class DetailTransaksiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailtransaksi)

        // Navigasi ke beranda ketika tombol home diklik
        val navHome: ImageView = findViewById(R.id.nav_home)
        navHome.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
// Tutup halaman saat ini agar tidak kembali ke detail
        }
    }
}
