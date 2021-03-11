package fr.iut.projet.modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Carnet implements Serializable {

    //ATTRIBUTS
    private String titre;
    private String date;
    private String lieu;
    private ArrayList<String> listePhotos;
    private ArrayList<String> listeTextes;

    //CONSTRUCTEURS

    public Carnet(String titre, String date, String lieu) {
        this.listePhotos = new ArrayList<>();
        this.listeTextes = new ArrayList<>();
        this.titre=titre;
        this.date=date;
        this.lieu=lieu;
    }


    //GETTERS ET SETTERS

    public void addPhoto(String photo){
       listePhotos.add(photo);
    }

    public void addTexte(String texte){
        listeTextes.add(texte);
    }

    public List<String> getListePhotos() {
        return listePhotos;
    }


    public List<String> getListeTextes() {
        return listeTextes;
    }

    public String toString(){

        return "\nTitre du carnet : "+this.titre+"\n Date du voyage :"+this.date+"\n Lieu du voyage :"+this.lieu;
    }



}
