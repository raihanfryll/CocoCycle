package com.example.cococycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val marketplaceButton = findViewById<Button>(R.id.marketplaceButton)

        marketplaceButton.setOnClickListener {
            val intent = Intent(this, EcoMarketplaceActivity::class.java)
            startActivity(intent)
        }
    }
}
