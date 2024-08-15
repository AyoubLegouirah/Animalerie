import modele.Animal;
import modele.Chats;
import modele.Chien;
import modele.Oiseau;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            // Le programme de gestion doit :
            //– Encoder des animaux (chiens, chats, oiseaux)
            //– Lister les caractéristiques de tous les animaux encodés.
            //– Afficher le nombre de chats, de chiens et d’oiseaux
            //– Vérifier si certains animaux ne sont pas décédés durant la nuit.

        Animal chat = new Chats(2012,2,10,79,20,"male","felix","farouche",true,true );
        Animal chien = new Chien(2012,2,10,79,20,"male","cleb","labrador",true, "rouge" );
        Animal oiseau = new Oiseau(2012,2,10,79,20,"male","yoo",true,"stresser");

        System.out.println(" Le caractere de du chat : " + chat.getCaractere());
        System.out.println(" Le caractere du chien : " + chien.getCaractere());
        System.out.println(" Le caractere de l'oiseau : " + oiseau.getCaractere());



        chat.probality(50);
        chien.probality(40);
        oiseau.probality(2);

    }
}