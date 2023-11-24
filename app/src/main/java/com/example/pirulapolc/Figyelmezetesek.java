package com.example.pirulapolc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Figyelmezetesek extends AppCompatActivity {
    private TextView textViewFigyelmeztetesek;
    private RecyclerView rvFigyelmeztetesekLista;
    private Button btnVissza;
    private Button btnGyogyszertarKeresohoz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figyelmezetesek);
        init();

        btnVissza.setOnClickListener(view -> {
            Intent menure = new Intent(Figyelmezetesek.this, Menu.class);
            startActivity(menure);
            finish();
        });
    }

    private void init() {
        textViewFigyelmeztetesek = findViewById(R.id.figyelmeztetesek);
        rvFigyelmeztetesekLista = findViewById(R.id.figyelmeztetesekLista);
        btnVissza = findViewById(R.id.btnVisszater);
        btnGyogyszertarKeresohoz = findViewById(R.id.btnGyogyszertarKeresohoz);
    }
}