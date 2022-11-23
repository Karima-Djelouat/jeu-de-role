package fr.dawan.formation.test.game.model;

import fr.dawan.formation.test.game.enums.Sorts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NiveauMoyen extends Personnage {
    List<Sorts> sorts;
    
    public NiveauMoyen() {

    }

    public NiveauMoyen(String name, int life, boolean gender, Sorts sorts) {
        super(name, life, gender, sorts);
        this.sorts = new ArrayList(Arrays.asList(Sorts.BAGUETTE_MAGIQUE, Sorts.POTION));

    }

    public void choixPersoMoyen() {

        if (super.isGender() == true) {
            super.setName("Harry");
            
        } else if (super.isGender() == false) {
            super.setName("Hermione");
        }

    }

    // mettre cette méthode dans personne pour l'utiliser chez tout le monde
    // la variation de point (dans removeLife) est à déterminer
   

}
