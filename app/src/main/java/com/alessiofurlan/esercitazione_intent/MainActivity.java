package com.alessiofurlan.esercitazione_intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    EditText edtCognome;
    EditText edtTel;
    EditText edtWeb;
    EditText edtMail;
    EditText edtAnni;

    Button btnInvia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = findViewById(R.id.edtNome);
        edtCognome = findViewById(R.id.edtCognome);
        edtAnni = findViewById(R.id.edtAnni);
        edtMail = findViewById(R.id.edtEmail);
        edtTel = findViewById(R.id.edtTel);
        edtWeb = findViewById(R.id.edtWeb);

    }
    public boolean Controllo()
    {
        if(edtNome.getText().toString()=="" || edtCognome.getText().toString()=="" || edtTel.getText().toString()=="" || edtWeb.getText().toString()=="" || edtMail.getText().toString()=="" || edtAnni.getText().toString()=="")
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Attenzione");
            builder.setMessage("Inserire tutti i campi correttamente");
            builder.setCancelable(true);
            builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss(); // quit AlertDialog
                            finish(); // quit activity
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
            return false;
        }
        else
            return true;
    }

    public void Invio(View w){

    }
}