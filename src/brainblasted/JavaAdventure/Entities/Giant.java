package brainblasted.JavaAdventure.Entities;

import brainblasted.JavaAdventure.Properties.Health;
import brainblasted.JavaAdventure.Properties.ClassLibrary.EntityClass;;

/**
 * Giant
 */
public class Giant {

    public Giant () {
        double giantHealth  = Health.EntityHealth(EntityClass.GiantClass);
        System.out.printf("The giant's health is %.1f%n", giantHealth);
    }

    public void Attack () {
        
    }
}