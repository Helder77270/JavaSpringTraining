package com.esgi;

public class Objectif {
    private Integer id;
    private String libelle;
    private Integer parent_id;

    public Objectif(){
        this.id = new Integer(0);
        this.libelle = new String();
        this.parent_id = new Integer(0);
    }

    public Objectif(Integer _id, String _libelle, Integer _parent_id){
        this.id = _id;
        this.libelle = _libelle;
        this.parent_id = _parent_id;
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

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }
}
