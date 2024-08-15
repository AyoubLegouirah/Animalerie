package modele;

public class Chats extends Animal {

    private boolean griffes;
    private boolean poils;
    public static int nbChats = 0;

    public Chats(int dateArriver, int ageHumain, int age, int taille, int poids, String sexe, String nom, String caractere, boolean griffes, boolean poils) {
        super(dateArriver, ageHumain, age, taille, poids, sexe, nom, caractere);
        this.griffes = griffes;
        this.poils = poils;
        nbChats++;
    }

    public static int getNbChats() {
        return nbChats;
    }

    public boolean isGriffes() {
        return this.griffes;
    }

    public boolean isPoils() {
        return this.poils;
    }
}
