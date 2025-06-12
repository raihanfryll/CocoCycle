package com.example.cococycle

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class DaftarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar) // nama file layout adalah daftar.xml

        // Ambil referensi dari komponen UI
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val signupButton = findViewById<Button>(R.id.signupButton)
        val loginLink = findViewById<TextView>(R.id.loginLink)

        // Tombol DAFTAR ditekan
        signupButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && username.isNotEmpty() && password.isNotEmpty()) {
                // Contoh validasi sederhana
                Toast.makeText(this, "Pendaftaran berhasil", Toast.LENGTH_SHORT).show()

                // Kembali ke halaman login setelah berhasil daftar
                val intent = Intent(this, MasukActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show()
            }
        }

        // Teks 'Masuk' ditekan
        loginLink.setOnClickListener {
            val intent = Intent(this, MasukActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
