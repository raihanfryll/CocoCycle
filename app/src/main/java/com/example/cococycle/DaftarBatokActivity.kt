package com.example.cococycle

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cococycle.R

class DaftarBatokActivity : AppCompatActivity() {

    private lateinit var backButton: ImageView
    private lateinit var btnFilter: ImageView
    private lateinit var btnEdit: ImageView
    private lateinit var searchBar: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftarbatokkelapa)

        // Inisialisasi View
        backButton = findViewById(R.id.back_button)
        btnFilter = findViewById(R.id.btnFilter)
        btnEdit = findViewById(R.id.btnEdit)
        searchBar = findViewById(R.id.searchBar) // Tambahkan android:id="@+id/searchBar" pada EditText jika belum ada

        // Aksi tombol kembali
        backButton.setOnClickListener {
            finish()
        }

        // Aksi tombol filter
        btnFilter.setOnClickListener {
            Toast.makeText(this, "Filter ditekan", Toast.LENGTH_SHORT).show()
            // Tambahkan aksi filter di sini
        }

        // Aksi tombol edit
        btnEdit.setOnClickListener {
            val intent = Intent(this, EditBatokKelapaActivity::class.java)
            startActivity(intent)
        }


        // Aksi pencarian
        searchBar.setOnEditorActionListener { textView, _, _ ->
            val query = textView.text.toString()
            Toast.makeText(this, "Mencari: $query", Toast.LENGTH_SHORT).show()
            // Tambahkan aksi pencarian di sini
            true
        }
    }
}
