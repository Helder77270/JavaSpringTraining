package com.esgi;

import java.util.ArrayList;

public class Coach {

    private String nom;
    private String prenom;
    private Integer code_postal;
    private ArrayList<Cours> cours = new ArrayList<Cours>();

    public Coach(String nom, String prenom, Integer code_postal, ArrayList<Cours> cours) {
        this.nom = nom;
        this.prenom = prenom;
        this.code_postal = code_postal;
        this.cours = cours;
    }

    public Coach() {
        this.nom = new String();
        this.prenom = new String();
        this.code_postal = new Integer(0);
        this.cours = new ArrayList<Cours>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(Integer code_postal) {
        this.code_postal = code_postal;
    }

    public ArrayList<Cours> getCours() {
        return cours;
    }

    public void setCours(ArrayList<Cours> cours) {
        this.cours = cours;
    }
}
