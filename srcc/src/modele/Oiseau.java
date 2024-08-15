package modele;

public class Oiseau extends Animal{

    private boolean habitation;
    private static int NbOiseau = 0;

    public Oiseau(int dateArriver, int ageHumain, int age, int taille, int poids, String sexe, String nom, String caractere, boolean habitation ) {
        super(dateArriver, ageHumain, age, taille, poids, sexe, nom, caractere);
        this.habitation = habitation;
        NbOiseau++;
    }

    public static int getNbOiseau() {
        return NbOiseau;
    }

    public boolean isHabitation() {
        return habitation;
    }
}
