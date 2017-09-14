package brainblasted.JavaAdventure.Properties;

import brainblasted.JavaAdventure.Properties.ClassLibrary;
import brainblasted.JavaAdventure.Properties.ClassLibrary.EntityClass;

/**
 * Armor
 */
public class Armor {
    public final double BASE_ARMOR = 0;

    public Armor () {
        
    }

    public boolean isArmorEquiped () {
        if (armorRating == BASE_ARMOR) {
            return false; 
        } else {
            return true;
        }
    }

    public double armorRating;
}