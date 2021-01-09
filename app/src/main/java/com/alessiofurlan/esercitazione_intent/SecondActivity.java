package com.alessiofurlan.esercitazione_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Contatto c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         c = (Contatto)getIntent().getSerializableExtra("contatto");
    }

    public void Chiama(View v){
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+c.telefono));
        startActivity(call);
    }
    public void Email(View v){

    }
    public void SitoWeb(View v){

    }

}