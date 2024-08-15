package game;

import modele.Animal;
import modele.Chats;
import modele.Chien;
import modele.Oiseau;


public class Game {
    public void start (){

        Animal chat = new Chats(2012, 2, 10, 79, 20, "male", "felix", "farouche", true, true);
        Animal chat1 = new Chats(2032, 1, 30, 19, 40, "femelle", "yo", "enerver", true, false);
        Animal chien = new Chien(2012, 2, 10, 79, 20, "male", "cleb", "labrador", "true", true);
        Animal oiseau = new Oiseau(2012, 2, 10, 79, 20, "male", "yoo", "curieux", true);

        System.out.println(" Le caractere du chat : " + chat.getCaractere());
        System.out.println(" Le caractere du chien : " + chien.getCaractere());
        System.out.println(" Le caractere de l'oiseau : " + oiseau.getCaractere());

        System.out.println("Il y a " + Chats.getNbChats() + " chats");
        System.out.println("Il y a " + Chien.getNbChien() + " chiens");
        System.out.println("Il y a " + Oiseau.getNbOiseau() + " oiseaux");

        chat.probality(50);
        chien.probality(40);
        oiseau.probality(2);

    }
}
