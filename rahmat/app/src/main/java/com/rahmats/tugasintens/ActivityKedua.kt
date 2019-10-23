package com.rahmats.tugasintens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityKedua : AppCompatActivity() {

    internal lateinit var getnim: TextView
    internal lateinit var getnama: TextView
    internal lateinit var getnilai: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val intent = getIntent();
        val nim = intent.getStringExtra("Nim")
        val nama = intent.getStringExtra("Nama")
        val nilai = intent.getStringExtra("Nilai")


        val dtnim = intent.getStringArrayExtra("nim")
        getnim = TextView(this)
        val dtnama = intent.getStringArrayExtra("nama")
        getnama = TextView(this)
        val dtnilai = intent.getStringArrayExtra("nilai")
        getnilai = TextView(this)

        val resultTv = findViewById<TextView>(R.id.resultTv)


        resultTv.text = "Nama: "+nim+"\nEmail: "+nama+"\nPhone: "+nilai



    }
}