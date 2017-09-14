package brainblasted.JavaAdventure.Properties;

import brainblasted.JavaAdventure.Properties.ClassLibrary;
import brainblasted.JavaAdventure.Properties.ClassLibrary.EntityClass;

/**
 * Health
 */
public class Health {
    
    // Provides the health of given entityClass
    public static double EntityHealth (EntityClass entityClass) {
        double health = 0;
        final double BASE_HEALTH = 100;
        if (entityClass == EntityClass.SpiderClass) {
            health = BASE_HEALTH + (0.5 * BASE_HEALTH);
        } else if (entityClass == EntityClass.PlayerClass) {
            health = BASE_HEALTH;
        } else if (entityClass == EntityClass.GiantClass) {
            health = BASE_HEALTH + (0.75 * BASE_HEALTH);
        }
        return health;
    }
}