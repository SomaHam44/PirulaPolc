package com.example.pirulapolc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

public class VasarlasRogzitese extends AppCompatActivity {

    private Button btnFelvesz;
    private Button btnHozzaad;
    private Button btnVissza;
    private Button btnMentes;
    private DatePicker lejaratiDatumValaszto;
    private RecyclerView rvVasarlasLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vasarlas_rogzitese);
    }
}