package com.example.cococycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EditBatokKelapaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editbatokkelapa)

        val btnKonfirmasi = findViewById<Button>(R.id.btnKonfirmasi)
        btnKonfirmasi.setOnClickListener {
            val intent = Intent(this, LokasiPengambilanActivity::class.java)
            startActivity(intent)
        }
    }
}
