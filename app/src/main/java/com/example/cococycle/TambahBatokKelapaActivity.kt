package com.example.cococycle

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class TambahBatokKelapaActivity : AppCompatActivity() {

    private val PICK_IMAGE_REQUEST = 1
    private var selectedImageUri: Uri? = null
    private lateinit var kondisiTerpilih: String
    private lateinit var imagePreview: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tambahbatokkelapa)

        // Tombol Back
        findViewById<ImageView>(R.id.back_button).setOnClickListener {
            finish()
        }

        // Pilih kondisi
        val bersih = findViewById<LinearLayout>(R.id.kondisi_bersih)
        val kotor = findViewById<LinearLayout>(R.id.kondisi_kotor)
        val diproses = findViewById<LinearLayout>(R.id.kondisi_diproses)

        kondisiTerpilih = ""

        bersih.setOnClickListener {
            kondisiTerpilih = "Bersih"
            Toast.makeText(this, "Kondisi: Bersih", Toast.LENGTH_SHORT).show()

            // Pindah ke halaman DaftarBatokActivity
            val intent = Intent(this, DaftarBatokActivity::class.java)
            startActivity(intent)
        }


        kotor.setOnClickListener {
            kondisiTerpilih = "Kotor"
            Toast.makeText(this, "Kondisi: Kotor", Toast.LENGTH_SHORT).show()
        }

        diproses.setOnClickListener {
            kondisiTerpilih = "Diproses"
            Toast.makeText(this, "Kondisi: Diproses", Toast.LENGTH_SHORT).show()
        }

        // Tombol konfirmasi
        findViewById<Button>(R.id.konfirmasi_button).setOnClickListener {
            val beratInput = findViewById<EditText>(R.id.berat_edit_input).text.toString()
            if (beratInput.isBlank() || kondisiTerpilih.isBlank() || selectedImageUri == null) {
                Toast.makeText(this, "Mohon lengkapi semua data", Toast.LENGTH_SHORT).show()
            } else {
                // Proses data di sini (bisa simpan ke server atau database lokal)
                Toast.makeText(this, "Batok Kelapa Ditambahkan!", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }

    private fun openImagePicker() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.data != null) {
            selectedImageUri = data.data
            imagePreview.setImageURI(selectedImageUri)
        }
    }
}
