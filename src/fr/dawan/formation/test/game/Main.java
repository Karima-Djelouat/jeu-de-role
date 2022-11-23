package fr.dawan.formation.test.game;

import java.util.Scanner;

import fr.dawan.formation.test.game.model.Méchant;
import fr.dawan.formation.test.game.model.NiveauMoyen;
import fr.dawan.formation.test.game.model.Personnage;

public class Main {

    public static void main(String[] args) {

        String personnage;
        Scanner scan = new Scanner(System.in);

        System.out.println("BIENVENUE DANS NOTRE JEU !");
        System.out.println("\nVous allez pouvoir choisir le sexe de votre personnage");
        System.out.println("Taper [1] pour Homme - Taper [2] pour Femme");
        int choix = scan.nextInt();

        // récup le genre avec set
        // si boolean est true on affiche hommes :

        if (choix == 1) {
            System.out.println("\nQuelle personnage voulez-vous être ?");
            System.out.println("Taper [ A ] pour Tanguy | Taper [ B ] pour Harry Potter | Taper [ C ] pour Hercule");
            personnage = scan.next();
            if (personnage.equals("A")) {
                personnage = "Tanguy"; // getNom (changer nom en Tanguy) et récup la classe Moyen
                System.out.println("\nBonjour Tanguy ! Tu as 500 pts de vie et 80 pts d'expérience ");
            }

            if (personnage.equals("B")) {

                NiveauMoyen harry = new NiveauMoyen();
                Méchant méchant = new Méchant();
                harry.setName("Harry");
                méchant.choixMéchant(harry);
                méchant.getName();
                harry.accueil(harry.getName());
                System.out.println("Tu vas affronter : " + méchant.getName() + ", ton plus grand ennemi à Poudlard.");

                // System.out.println("\nBonjour Harry Potter ! Tu as 500 pts de vie et 100 pts
                // d'expérience ");
                System.out.println(
                        "\n-------------------------------------------------------------------------------------------------\n");
                System.out.println("ATTENTION LA PARTIE COMMENCE");
                System.out.println(
                        "\n-------------------------------------------------------------------------------------------------\n");
                System.out.println();

                while (!méchant.isDead() && !harry.isDead()) {
                    // while(harry.compare(harry)==false) {
                    System.out.println("Entre un chiffre entre 1 et 6 pour attaquer :");
                    int dice = scan.nextInt();
                    harry.attaque(dice, méchant);
                    méchant.attaque(harry);
                    System.out.println("Attention... " + méchant.getName() + " va t'attaquer !");
                    
                    if (dice == 2) {
                        System.out.println("Bravo ! Tu as perdu 20 points au lieu de 50 !");
                        harry.addLife(30);
                    }
                    
                    
                    
                    System.out.println("Il te reste : " + harry.getLife() + " ! Concentre toi !");
                }
                
                
                
                if (harry.getLife() <= 0 || méchant.getLife() >= 0) {
                    System.out.println(méchant.getName() + " est le vainqueur !");
                } else if (harry.getLife() >= 0 && méchant.getLife() <= 0) {
                    System.out.println(harry.getName() + " est le vainqueur !");
                }
            }
            if (personnage.equals("C")) {
                personnage = "Hercule";
                System.out.println("\nBonjour Hercule ! Tu as 500 pts de vie et 120 pts d'expérience ");
            }
        }

        // si boolean est false on affiche femme :
        if (choix == 2) {
            System.out.println("\nQuelle personnage voulez-vous être ?");
            System.out.println(
                    "Taper [ A ] pour Bridget Jones | Taper [ B ] pour Hermione | Taper [ C ] pour Xena la Guerrière");
            personnage = scan.next();
            // set le personnage selon le choix (le choix est le scan)

            if (personnage.equals("A")) {
                System.out.println("\nBonjour Bridget Jones ! Tu as 500 pts de vie et 80 pts d'expérience ");
            }
            if (personnage.equals("B")) {
                NiveauMoyen hermione = new NiveauMoyen();
                Méchant méchant = new Méchant();
                hermione.setName("Hermione");
                méchant.choixMéchant(hermione);
                méchant.getName();
                hermione.accueil(hermione.getName());
                System.out.println("Tu vas affronter : " + méchant.getName() + ", ton plus grand ennemi à Poudlard.");

                // System.out.println("\nBonjour Harry Potter ! Tu as 500 pts de vie et 100 pts
                // d'expérience ");
                System.out.println(
                        "\n-------------------------------------------------------------------------------------------------\n");
                System.out.println("ATTENTION LA PARTIE COMMENCE");
                System.out.println(
                        "\n-------------------------------------------------------------------------------------------------\n");
                System.out.println();

                while (!méchant.isDead() && !hermione.isDead()) {
                    // while(harry.compare(harry)==false) {
                    System.out.println("Entre un chiffre entre 1 et 6 pour attaquer :");
                    int dice = scan.nextInt();
                    hermione.attaque(dice, méchant);
                    méchant.attaque(hermione);
                    System.out.println("Attention... " + méchant.getName() + " va t'attaquer !");
                    
                    if (dice == 2) {
                        System.out.println("Bravo ! Tu as perdu 20 points au lieu de 50 !");
                        hermione.addLife(30);
                    }

                    System.out.println("Il te reste : " + hermione.getLife() + " ! Concentre toi !");
                }
            
                
                
                if (hermione.getLife() <= 0 || méchant.getLife() >= 0) {
                    System.out.println(méchant.getName() + " est le vainqueur !");
                } else if (hermione.getLife() >= 0 && méchant.getLife() <= 0) {
                    System.out.println(hermione.getName() + " est le vainqueur !");
                }
            }
            
            if (personnage.equals("C")) {
                System.out.println("\nBonjour Xena la Guerrière ! Tu as 500 pts de vie et 120 pts d'expérience ");
            }
        }

}

}
