package brainblasted.JavaAdventure.Entities;

import brainblasted.JavaAdventure.Properties.Health;

/**
 * Giant
 */
public class Giant extends Health {

    public Giant () {
        this.healthFactor = 0.5;
        this.health = getHealth(healthFactor);
        onInit();
    }

    private void onInit() {
        System.out.println(this.toString() + " has spawned.");
	}

    public @Override String toString() {
        return "Giant";
    }
}