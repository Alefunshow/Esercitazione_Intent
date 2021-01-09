package com.alessiofurlan.esercitazione_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("NOME");
        String cognome = intent.getStringExtra("COGNOME");
        String anni = intent.getStringExtra("ANNI");
        String mail = intent.getStringExtra("EMAIL");
        String telefono = intent.getStringExtra("TELEFONO");
        String sito = intent.getStringExtra("SITO");

        Contatto contatto = (Contatto)getIntent().getSerializableExtra("contatto");

    }
}