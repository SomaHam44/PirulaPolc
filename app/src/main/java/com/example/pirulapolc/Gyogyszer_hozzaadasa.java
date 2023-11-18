package com.example.pirulapolc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Gyogyszer_hozzaadasa extends AppCompatActivity {

    private EditText editTextNev;

    private EditText editTaxtHatoanyag;

    private EditText editTextTajSzam;

    private EditText editTextNumber;

    private androidx.recyclerview.widget.RecyclerView idopontLista;

    private Button btnMentes;

    private Button btnVissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyogyszer_hozzaadasa);

        btnMentes.setOnClickListener(view -> {
            //Mentés??
            Intent gyogyszereimre = new Intent(Gyogyszer_hozzaadasa.this, Gyogyszereim.class);
            startActivity(gyogyszereimre);
            finish();
        });

        btnVissza.setOnClickListener(view -> {
            Intent gyogyszereimre = new Intent(Gyogyszer_hozzaadasa.this, Gyogyszereim.class);
            startActivity(gyogyszereimre);
            finish();
        });
    }
}