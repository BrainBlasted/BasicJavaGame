package brainblasted.JavaAdventure.Entities;

import brainblasted.JavaAdventure.Properties.ClassLibrary;
import brainblasted.JavaAdventure.Properties.Health;
import brainblasted.JavaAdventure.Properties.ClassLibrary.EntityClass;

/**
 * PlayerCharacter
 */
public class PlayerCharacter {

    public PlayerCharacter () {
        double playerHealth = Health.EntityHealth(EntityClass.PlayerClass);
        System.out.printf("The player's health is %.1f%n", playerHealth);
    }

    public void Attack () {

    }
}