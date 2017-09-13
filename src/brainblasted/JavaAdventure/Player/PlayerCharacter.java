package brainblasted.JavaAdventure.Player;

import brainblasted.JavaAdventure.Properties.ClassLibrary;
import brainblasted.JavaAdventure.Properties.Health;
import brainblasted.JavaAdventure.Properties.ClassLibrary.EntityClass;

/**
 * PlayerCharacter
 */
public class PlayerCharacter {

    public PlayerCharacter () {
        EntityClass classOfCharacter = EntityClass.PlayerClass;
        double playerHealth = Health.EntityHealth(classOfCharacter);
        System.out.println(playerHealth);
    }
}