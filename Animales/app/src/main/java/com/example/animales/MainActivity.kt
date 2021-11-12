package com.example.animales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CpuUsageInfo
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var lv_lista: ListView
    private lateinit var txt_Info : TextView

    private val animal = arrayOf("Jaguar","Lince","Gato","Gavilan")
    private val especie = arrayOf("Gatuno","Ave")
    private val color = arrayOf("negro", "blanco", "Gris");
    private val sexo = arrayOf("Hembra", "Macho");
    private val peso = arrayOf("100kg", "85kg", "10lb", "5lb");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_Info = findViewById(R.id.txt_Info)
        lv_lista = findViewById(R.id.lv_lista)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1,animal)
        lv_lista.adapter = adaptador

        lv_lista.setOnItemClickListener { adapterView, view, i, l ->
            txt_Info.setText("El animal es "+lv_lista.getItemAtPosition(i)+ " es "+especie[i]+" "+lv_lista.getItemAtPosition(i)+"  "+sexo[i]+"  ")
    }
}
}
