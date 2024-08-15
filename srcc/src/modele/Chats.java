package modele;

public class Chats extends Animal {

    private boolean griffes;
    private boolean poils;

    public Chats(int dateArriver, int ageHumain, int age, int taille, int poids, String sexe, String nom, String caractere, boolean griffes, boolean poils) {
        super(dateArriver, ageHumain, age, taille, poids, sexe, nom, caractere);
        this.griffes = griffes;
        this.poils = poils;
    }


    public boolean isGriffes() {
        return this.griffes;
    }

    public boolean isPoils() {
        return this.poils;
    }
}
