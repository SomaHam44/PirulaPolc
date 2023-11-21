package com.example.pirulapolc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.maps.MapView;

public class GyogyszertarKeres extends AppCompatActivity {
    private MapView gyogyszertarTerkep;
    private Button btnVissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyogyszertar_keres);
        init();

        btnVissza.setOnClickListener(view -> {
            Intent visszaMenube = new Intent(GyogyszertarKeres.this, Menu.class);
            startActivity(visszaMenube);
            finish();

        });
    }
    private void init() {
        gyogyszertarTerkep = findViewById(R.id.gyogyszertarTerkep);
        btnVissza = findViewById(R.id.btnVissza);
    }
}