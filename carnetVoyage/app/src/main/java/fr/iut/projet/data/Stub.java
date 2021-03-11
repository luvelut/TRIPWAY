package fr.iut.projet.data;

import fr.iut.projet.modele.Carnet;
import fr.iut.projet.modele.GestionnaireCarnet;

public class Stub {
    private GestionnaireCarnet laListe=new GestionnaireCarnet();
    private Carnet c1=new Carnet("Voyage à Londres","Juillet 2020","Angeleterre");
    private Carnet c2=new Carnet("Voyage à Paris","Août 2020","France");
    private Carnet c3=new Carnet("Voyage à Tokyo","Juin 2020","Japon");

    public void testAffichageListe(){
        laListe.addCarnet(c1);
        laListe.addCarnet(c2);
        laListe.addCarnet(c3);
    }




}
