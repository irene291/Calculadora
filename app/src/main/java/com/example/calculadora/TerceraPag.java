package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TerceraPag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_pag);
    }

    public void abrirCuartaApp(View view) {
        Intent i = new Intent(getApplicationContext(), CuartaPag.class);
        startActivity(i);
    }
}