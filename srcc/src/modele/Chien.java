package modele;

public class Chien extends Animal{

    private String race;
    private boolean dresser;


    public Chien(int dateArriver, int ageHumain, int age, int taille, int poids, String sexe, String nom, String race, boolean dresser, String caractere) {
        super(dateArriver, ageHumain, age, taille, poids, sexe, nom, caractere);
        this.race = race;
        this.dresser = dresser;
    }

    public String getRace() {
        return race;
    }

    public boolean isDresser() {
        return dresser;
    }
}
