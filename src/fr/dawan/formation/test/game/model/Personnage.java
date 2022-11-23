package fr.dawan.formation.test.game.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;

import fr.dawan.formation.test.game.enums.Sorts;

public abstract class Personnage {
    static Scanner scan = new Scanner(System.in);
    private String name;
    private boolean gender;
    private int life = 500;
    List<Sorts> sorts;

    // faire méthode pour lancer le sort ; méthode abstraite à définir dans les
    // classes enfants (pour enlever les points)

    public Personnage() {
    }

    public Personnage(String name, int life, boolean gender, Sorts sorts) {
        this.name = name;
        this.gender = gender;

    }

    public void removeLife(int degats) {
        this.life -= degats;

    }

    public int addLife(int pv) {

        this.life += pv;
        return this.getLife();
    }

    public boolean isDead() {
        return this.getLife() <= 0;
    }

    public int choisirSort() {

        System.out.println("Choisissez un sort :");
        System.out.println("( Indiquez l'index du sort souhaité )");
        for (int i = 0; i < sorts.size(); i++) {
            System.out.println("Le nom du sort est " + sorts.get(i) + "dont l'index est :" + i);

        }
        int index = scan.nextInt();
        return sortChoisi(sorts.get(index));
    }

    public int sortChoisi(Sorts s) {
        int degats = 0;

        switch (s) {

        case BAGUETTE_MAGIQUE:
            System.out.println("");
            degats = 50;
            break;
        default:
            System.out.println("Entre un nombre entre 1 et 6. Recommence.");
            break;
        // ffaire les calcul des dommages que je mets dans le paramètre d'attaque
        }
        // quand leswitch est terminé, appel de la méthode attaque
        return degats;
    }

    public void attaque(int dice, Méchant méchant) {
       int degats =  choisirSort();
        
        switch (dice) {
        
        //faire un random pour le lancer de dé
        case 1:
        case 5:
            méchant.removeLife(50);
            System.out.println("Il reste " + méchant.getLife() + " points à " + méchant.getName() + " !");
            break;
        case 2:
            méchant.removeLife(40);
            System.out.println("Il reste " + méchant.getLife() + " points à " + méchant.getName()
                    + " !");
            break;
        case 3:
            méchant.removeLife(0);
            System.out.println("Tu n'as pas réussi à l'atteindre ! Il reste toujours " + méchant.getLife()
                    + " points à " + méchant.getName());
            break;
        case 4:
            méchant.removeLife(100);
            System.out.println("Il reste " + méchant.getLife() + " points à " + méchant.getName() + " ! Bravo !");
            break;

        case 6:
            méchant.removeLife(200);
            System.out.println(méchant.getName() + " (bouhh, t'es nul(le))! Il lui reste " + méchant.getLife() + " points seulement. Héhé");
            break;

        default:
            System.out.println("Entre un nombre entre 1 et 6. Recommence.");
            break;
        }
    }
    
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accueil(String name) {
        System.out.println("Bonjour " + name + " ! Tu as " + life + " points de vie... ");
    }
    
    // méthode pour la présentation "bonjour truc tu as tant de points de vie"
    // méthode pour les noms :

}
