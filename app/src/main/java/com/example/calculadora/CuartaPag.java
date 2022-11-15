package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CuartaPag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta_pag);
    }

    public void abrirQuintaApp(View view) {
        Intent i = new Intent(getApplicationContext(), QuintaPag.class);
        startActivity(i);
    }
}