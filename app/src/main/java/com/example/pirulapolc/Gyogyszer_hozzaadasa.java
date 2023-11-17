package com.example.pirulapolc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Gyogyszer_hozzaadasa extends AppCompatActivity {

    private EditText editTextNev;

    private EditText editTaxtHatoanyag;

    private EditText editTextTajSzam;

    private EditText editTextNumber;

    private androidx.recyclerview.widget.RecyclerView idopontLista;

    private Button btnTovabb;

    private Button btnVissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyogyszer_hozzaadasa);
    }
}