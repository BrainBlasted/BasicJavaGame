/**
 * Armor.java
 *  The class that handles all the manipulation of armor
 *  values. 
 */
package brainblasted.JavaAdventure.Properties;

public class Armor {
    protected double baseArmor;
    protected double armorRating;

    public Armor () {
        this.baseArmor = 100;
        this.armorRating = baseArmor;
    }

    public boolean isArmorEquiped (String ent) {
        if (armorRating == baseArmor){
            System.out.println(ent + " has no armor equiped.");
            return false; 
        } else {
            System.out.println(ent + " has armor equiped.");
            return true;
        }
    }

    public double getArmorRating () {
        return armorRating;
    }
}