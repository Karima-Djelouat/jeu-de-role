package fr.dawan.formation.test.game.model;

import fr.dawan.formation.test.game.enums.Sorts;

public class Méchant extends Personnage {

    public Méchant() {

    }

    public Méchant(String name, int life, boolean gender, Sorts sorts) {
        super(name, life, gender, sorts);
        // TODO Auto-generated constructor stub
    }

    public void choixMéchant(Personnage p) {

        // si p.getNom.equals=="Tanguy" || p.getNom.equals=="Bridget" {
        // set le nom du méchant à christian
        // }

        if (p.getName().equals("Harry") ) {
            this.setName("Draco");
            this.setGender(true);
        } else if (p.getName().equals("Hermione")) {
            this.setName("Pansy");
            this.setGender(false);
        }
    }
    
    public void sobriquet(Méchant m) {
        if (m.isGender()==true) {
            System.out.println(", le nul");
        } else if (m.isGender()==false) {
            System.out.println(", la nulle");
        }
    }

    public void attaque(Personnage p) {

        p.removeLife(50);

    }

}
