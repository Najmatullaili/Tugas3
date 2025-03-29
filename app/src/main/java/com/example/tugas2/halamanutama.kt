package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas2.databinding.ActivityHalamanutamaBinding
import com.example.tugas2.databinding.ActivityMainBinding

class halamanutama : AppCompatActivity() {
    private lateinit var binding: ActivityHalamanutamaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_halamanutama)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityHalamanutamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button4.setOnClickListener {
            val intentMain = Intent(this, RecyclerActivity::class.java)
            startActivity(intentMain)
        }

        binding.button.setOnClickListener {
            val intentMain = Intent(this, HomeActivity::class.java)
            startActivity(intentMain)
        }
    }
}