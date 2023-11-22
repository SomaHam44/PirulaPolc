package com.example.pirulapolc;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
public class Menu extends AppCompatActivity {
    private Button btnFigyelmeztetesek;
    private Button btnGyogyszereim;
    private Button btnVasarlasRogzitese;
    private Button btnGyogyszerHozzaad;
    private Button btnGyogyszertarKereses;
    private Button btnGyogyszerBevetel;
    private Button btnVissza;
    private ImageButton btnBeallitasok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        init();
        btnFigyelmeztetesek.setOnClickListener(view -> {
            Intent figyelmeztetesekre = new Intent(Menu.this, Figyelmezetesek.class);
            startActivity(figyelmeztetesekre);
            finish();
        });
        btnGyogyszereim.setOnClickListener(view -> {
            Intent gyogyszereimre = new Intent(Menu.this, Gyogyszereim.class);
            startActivity(gyogyszereimre);
            finish();
        });
        btnVasarlasRogzitese.setOnClickListener(view -> {
            Intent vasarlasra = new Intent(Menu.this, VasarlasRogzitese.class);
            startActivity(vasarlasra);
            finish();
        });
        btnGyogyszerHozzaad.setOnClickListener(view -> {
            Intent gyogyszerhozzaadra = new Intent(Menu.this, Gyogyszer_hozzaadasa.class);
            startActivity(gyogyszerhozzaadra);
            finish();
        });
        btnGyogyszertarKereses.setOnClickListener(view -> {
            Intent gyogyszertarkeresore = new Intent(Menu.this, GyogyszertarKeres.class);
            startActivity(gyogyszertarkeresore);
            finish();
        });
        btnGyogyszerBevetel.setOnClickListener(view -> {
            Intent gyogyszerbevetelre = new Intent(Menu.this, GyogyszerBevetel.class);
            startActivity(gyogyszerbevetelre);
            finish();
        });
        btnVissza.setOnClickListener(view -> {
            Intent beallitasokra = new Intent(Menu.this, Beallitasok.class);
            startActivity(beallitasokra);
            finish();
        });
    }

    private void init() {
        btnFigyelmeztetesek = findViewById(R.id.btnFigyelmeztetesek);
        btnGyogyszereim = findViewById(R.id.btnGyogyszereim);
        btnVasarlasRogzitese = findViewById(R.id.btnVasarlasRogzitese);
        btnGyogyszerHozzaad = findViewById(R.id.btnGyogyszerHozzaad);
        btnGyogyszertarKereses = findViewById(R.id.btnGyogyszertarKereses);
        btnGyogyszerBevetel = findViewById(R.id.btnGyogyszerbevetel);
        btnVissza = findViewById(R.id.btnVissza);
    }
}