package com.example.cococycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MasukActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.masuk)

        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val registerText = findViewById<TextView>(R.id.registerText)

        loginButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Login berhasil", Toast.LENGTH_SHORT).show()

                // ⬇️ Arahkan ke DashboardActivity
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                finish()

            } else {
                Toast.makeText(this, "Email dan Password harus diisi", Toast.LENGTH_SHORT).show()
            }
        }

        registerText.setOnClickListener {
            val intent = Intent(this, DaftarActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }
    }
}
