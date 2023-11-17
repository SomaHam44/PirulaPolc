package com.example.pirulapolc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Beallitasok extends AppCompatActivity {

    private Button btnVissza;

    private Button btnTovabb;

    private EditText editTextNev;

    private EditText editTextSzulDatum;

    private EditText editTextTajSzam;

    private CheckBox checkboxRendszeresSzedes;

    private androidx.recyclerview.widget.RecyclerView idopontLista;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beallitasok);

        btnVissza.setOnClickListener(view -> {
            Intent fooldalra = new Intent(Beallitasok.this, MainActivity.class);
            startActivity(fooldalra);
            finish();
        });

        btnTovabb.setOnClickListener(view -> {
            Intent menure = new Intent(Beallitasok.this, Menu.class);
            startActivity(menure);
            finish();
        });
    }
}