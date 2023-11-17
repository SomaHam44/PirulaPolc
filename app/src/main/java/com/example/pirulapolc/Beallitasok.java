package com.example.pirulapolc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Beallitasok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beallitasok);
    }

    btnIndito.setOnClickListener(view -> {
        Intent beallitasokhoz = new Intent(MainActivity.this, beallitasok.class);
        startActivity(beallitasokhoz);
        finish();
    });

}