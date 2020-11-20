package com.esgi;

import java.io.Serializable;
import java.util.ArrayList;

public class Cours implements Serializable {

    private Integer id;
    private String libelle;
    private ArrayList<Objectif> objectifs = new ArrayList<Objectif>();

    public Cours(){
        this.id = new Integer(0);
        this.libelle = new String();
    }

    public Cours(Integer _id, String _libelle){
        this.id = _id;
        this.libelle = _libelle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void afficher(){
        System.out.println("C'est le cours d'id "+this.getId()+ " nommé " + this.getLibelle());
    }

    public ArrayList<Objectif> getObjectifs() {
        return objectifs;
    }

    public void setObjectifs(ArrayList<Objectif> objectifs) {
        this.objectifs = objectifs;
    }
}
