package modele;

public class Chats extends Animal {

    private String caractere;
    private boolean griffes;
    private boolean poils;

    public Chats(int dateArriver, int ageHumain, int age, int taille, int poids, String sexe, String nom, String caractere, boolean griffes, boolean poils) {
        super(dateArriver, ageHumain, age, taille, poids, sexe, nom);
        this.caractere = caractere;
        this.griffes = griffes;
        this.poils = poils;
    }


    public String getCaractere() {
        return this.caractere;
    }

    public boolean isGriffes() {
        return this.griffes;
    }

    public boolean isPoils() {
        return this.poils;
    }
}
