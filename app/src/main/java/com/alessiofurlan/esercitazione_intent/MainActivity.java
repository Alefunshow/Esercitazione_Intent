package com.alessiofurlan.esercitazione_intent;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nome = findViewById(R.id.txtNome);
        EditText cognome = findViewById(R.id.txtCognome);
        EditText anni = findViewById(R.id.txtAnni);
        EditText sitoWeb = findViewById(R.id.txtSitoWeb);
        EditText email = findViewById(R.id.txtEmail);
        EditText telefono = findViewById(R.id.txtTelefono);

    }
}