package com.example.myapplication;

import org.json.JSONException;
import org.json.JSONObject;

public class Perso {
    private Integer id;
    private String nom;
    private String prenom;

    public Perso(Integer id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Perso(JSONObject json) {

        try {
            this.id = json.getInt("id");
            this.nom = json.getString("nom");
            this.prenom = json.getString("prenom");
        } catch (JSONException e) {
            e.printStackTrace();
            this.id = 0;
            this.nom = "";
            this.prenom = "";
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
