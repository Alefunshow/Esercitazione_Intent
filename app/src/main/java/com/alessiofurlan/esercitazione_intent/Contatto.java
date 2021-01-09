package com.alessiofurlan.esercitazione_intent;

public class Contatto {

    String nome;
    String cognome;
    String eta;
    String sitoWeb;
    String email;
    String telefono;


    Contatto(){
        this.nome = "";
        this.cognome = "";
        this.eta = "";
        this.sitoWeb = "";
        this.email = "";
        this.telefono = "";
    }

    public void inserisciContatto(String n,String c,String e,String s,String em,String t){
        this.nome = n;
        this.cognome = c;
        this.eta = e;
        this.sitoWeb = s;
        this.email = em;
        this.telefono = t;
    }

}

