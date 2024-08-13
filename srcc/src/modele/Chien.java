package modele;

public class Chien extends Animal{

    private String couleurColier;
    private String race;
    private boolean dresser;


    public Chien(int dateArriver, int ageHumain, int age, int taille, int poids, String sexe, String nom, String couleurColier, String race, boolean dresser ) {
        super(dateArriver, ageHumain, age, taille, poids, sexe, nom);
        this.couleurColier = couleurColier;
        this.race = race;
        this.dresser = dresser;
    }

    public String getCouleurColier() {
        return couleurColier;
    }

    public String getRace() {
        return race;
    }

    public boolean isDresser() {
        return dresser;
    }
}
