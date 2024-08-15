package modele;

public class Chien extends Animal{

    private String race;
    private boolean dresser;
    private static int nbChien = 0;


    public Chien(int dateArriver, int ageHumain, int age, int taille, int poids, String sexe, String nom, String caractere, String race, boolean dresser) {
        super(dateArriver, ageHumain, age, taille, poids, sexe, nom, caractere);
        this.race = race;
        this.dresser = dresser;
        nbChien++;
    }

    public static int getNbChien() {
        return nbChien;
    }

    public String getRace() {
        return race;
    }

    public boolean isDresser() {
        return dresser;
    }
}
