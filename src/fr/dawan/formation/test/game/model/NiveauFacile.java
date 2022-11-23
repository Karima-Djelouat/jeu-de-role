package fr.dawan.formation.test.game.model;

public class NiveauFacile extends Personnage {

    
    private static int exp = 120;
    
    
    public NiveauFacile() {

    }



    public void choixPersoDifficile() {

        if (super.isGender() == true) {
            super.setName("Hercule");
        } else if (super.isGender() == false) {
            super.setName("Xena");
        }

    }

}
