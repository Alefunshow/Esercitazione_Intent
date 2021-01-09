package com.alessiofurlan.esercitazione_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Contatto c = (Contatto)getIntent().getSerializableExtra("contatto");
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3356897542"+c.telefono));
        startActivity(call);
    }
}