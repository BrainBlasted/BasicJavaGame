package brainblasted.JavaAdventure.Entities;

import brainblasted.JavaAdventure.Properties.Armor;
import brainblasted.JavaAdventure.Properties.Health;

/**
 * PlayerCharacter
 */
public class PlayerCharacter extends Health {
    private double strength;
    private double luck;

    public PlayerCharacter () {
        this.healthFactor = 0.2;
        this.health = getHealth(healthFactor);
        onInit();
    }

    /**
     * The set of methods to be run on spawn.
     * 
     * @category Utils
     */
    private void onInit() {
        System.out.println(this.toString() + " has spawned.");
        System.out.printf("%s's health is %.1f%n", this.toString(),this.health);
        PlayerArmor armorTracker = new PlayerArmor();
        armorTracker.isArmorEquiped(this.toString());
	}

	private class PlayerArmor extends Armor {
        public PlayerArmor() {
        }
    }

    /**
     * Returns the name of the PlayerCharacter;
     * Placeholder until name generation is
     * implemented.
     * 
     * @return
     *      The name of the PlayerCharacter Object
     * @category Utils
     */
    public @Override String toString() {
        return "Player";
    }
}
