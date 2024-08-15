package modele;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.random;

public abstract class Animal {
    public String nom;
    public String sexe;
    public String caractere;
    public int poids;
    public int taille;
    public int age;
    public int ageHumain;
    public int dateArriver;



    public Animal(int dateArriver, int ageHumain, int age, int taille, int poids, String sexe, String nom, String caractere) {
        this.dateArriver = dateArriver;
        this.ageHumain = ageHumain;
        this.age = age;
        this.sexe = sexe;
        this.caractere = caractere;
        this.taille = taille;
        this.poids = poids;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }

    public int getPoids() {
        return poids;
    }

    public int getTaille() {
        return taille;
    }

    public int getAge() {
        return age;
    }

    public int getAgeHumain() {
        return ageHumain;
    }

    public int getDateArriver() {
        return dateArriver;
    }

    public String getCaractere(){
        return caractere;
    }


    // Faire une probalité de décés en pourcantage pour chaque animal
    // Calcule de pourcentage si elle est supererieur au math random alors décés
    public void probality (int chance) {
        if ( chance >= Math.floor(random() * 1000)/100){
            System.out.println("L'animal " + this.nom + " est mort");
        }
        else {
            System.out.println("L'animal " + this.nom + " est en vie");
        }
    }

    public void crier (String message){
        System.out.println(this.nom + " crie : " + message);
    }

}
