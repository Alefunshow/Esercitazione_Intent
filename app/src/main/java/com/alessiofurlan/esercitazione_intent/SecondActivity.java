package com.alessiofurlan.esercitazione_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Contatto c = (Contatto)getIntent().getSerializableExtra("contatto");
        TextView txtNome = findViewById(R.id.txtProva);
        txtNome.setText(c.nome);
    }
}