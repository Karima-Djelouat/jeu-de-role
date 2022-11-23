package fr.dawan.formation.test.game.model;

import fr.dawan.formation.test.game.enums.Sorts;

public class NiveauDifficile extends Personnage {

    private static int exp = 80;

    public NiveauDifficile() {

    }

    public void choixPersoDifficile() {

        if (super.isGender() == true) {
            super.setName("Tanguy");
        } else if (super.isGender() == false) {
            super.setName("Bridget");
        }

    }

}
