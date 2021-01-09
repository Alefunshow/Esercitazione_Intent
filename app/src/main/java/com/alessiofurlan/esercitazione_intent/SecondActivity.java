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
         TextView nome2 = findViewById(R.id.txtNome2);
         nome2.setText(c.nome+" "+c.cognome);
    }

    public void Chiama(View v){
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+c.telefono));
        startActivity(call);
    }
    public void Email(View v){

        Intent email = new Intent(Intent.ACTION_SENDTO);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{c.email});
        email.putExtra(Intent.EXTRA_SUBJECT,"Subject here...");
        email.putExtra(Intent.EXTRA_TEXT, "Message here...");
        email.setType("text/plain");
        startActivity(Intent.createChooser(email, "Choose an Email client: "));

    }
    public void SitoWeb(View v){

        String url = c.sitoWeb;
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}