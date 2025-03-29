package com.example.tugas2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    private lateinit var motorRecyclerView: RecyclerView
    private lateinit var motorAdapter: MyAdapter
    private lateinit var listMotor : ArrayList<ItemData>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        motorRecyclerView = findViewById(R.id.motorRV)
        listMotor = ArrayList()

        listMotor.add(ItemData(R.drawable.crf, nama = "HONDA CRF", type = "Trail "))
        listMotor.add(ItemData(R.drawable.pcx, nama = "HONDA PCX ", type = "Pcx125"))
        listMotor.add(ItemData(R.drawable.fizr, nama = "YAMAHA F1ZR ", type = "Fizr1996 "))
        listMotor.add(ItemData(R.drawable.nmax, nama = "YAMAHA NMAX ", type = "Nmax155 "))
        listMotor.add(ItemData(R.drawable.wave, nama = "HONDA WAVE ", type = "WaveRSX FI "))
        listMotor.add(ItemData(R.drawable.fazzio, nama = "YAMAHA FAZZIO ", type = "Fazzio Hybrid"))
        listMotor.add(ItemData(R.drawable.genio, nama = "HONDA GENIO ", type = "Genio CBS"))
        listMotor.add(ItemData(R.drawable.ninja, nama = "KAWASAKI NINJA ", type = "Ninja ZX25RR "))
        listMotor.add(ItemData(R.drawable.rxking, nama = "YAMAHA RXKING ", type = "RXking cobra "))
        listMotor.add(ItemData(R.drawable.satria, nama = "SUZUKI SATRIA ", type = "Satria120S "))
        listMotor.add(ItemData(R.drawable.scoopy, nama = "HONDA SCOOPY ", type = "Scoopy Stylish "))
        listMotor.add(ItemData(R.drawable.supra, nama = "HONDA SUPRA", type = "Supra X125 "))
        listMotor.add(ItemData(R.drawable.vario, nama = "HONDA VARIO ", type = "Vario125 "))
        listMotor.add(ItemData(R.drawable.vespa, nama = "VESPA ", type = "Vespa Metik "))



        motorRecyclerView.layoutManager = LinearLayoutManager(this)
        motorRecyclerView.setHasFixedSize(true)
        motorAdapter = MyAdapter(listMotor)
        motorRecyclerView.adapter = motorAdapter
    }
}