package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaPag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pag);
    }

    public void arbrirTerceraApp(View view) {
            Intent i = new Intent(getApplicationContext(), TerceraPag.class);
            startActivity(i);

    }
}