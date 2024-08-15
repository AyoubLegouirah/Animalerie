package modele;

public class Oiseau extends Animal{

    private boolean habitation;

    public Oiseau(int dateArriver, int ageHumain, int age, int taille, int poids, String sexe, String nom, boolean habitation, String caractere ) {
        super(dateArriver, ageHumain, age, taille, poids, sexe, nom, caractere);
        this.habitation = habitation;
    }


    public boolean isHabitation() {
        return habitation;
    }
}
