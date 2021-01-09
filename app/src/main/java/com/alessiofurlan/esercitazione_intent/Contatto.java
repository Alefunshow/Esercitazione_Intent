package com.alessiofurlan.esercitazione_intent;

public class Contatto {
    private String nome;
    private String cognome;
    private String eta;
    private String sitoWeb;
    private String email;
    private String telefono;


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

