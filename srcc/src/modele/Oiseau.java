package modele;

public class Oiseau extends Animal{

    private String couleur;
    private boolean habitation;

    public Oiseau(int dateArriver, int ageHumain, int age, int taille, int poids, String sexe, String nom, String couleur, boolean habitation ) {
        super(dateArriver, ageHumain, age, taille, poids, sexe, nom);
        this.couleur = couleur;
        this.habitation = habitation;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean isHabitation() {
        return habitation;
    }
}
