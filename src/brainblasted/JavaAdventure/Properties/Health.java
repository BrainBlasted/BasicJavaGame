/**
 * Health.java
 *  The class that handles the assigning and manipulation
 *  of an object's health.
 */
package brainblasted.JavaAdventure.Properties;

public class Health {
    protected double health;
    protected double healthFactor;
    protected double BASE_HEALTH;

    public Health() {
        this.BASE_HEALTH = 100;
    }
    
    public double getHealth(double healthFactor) {
        return BASE_HEALTH;
    }
}