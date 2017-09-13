package brainblasted.JavaAdventure.Properties;

/**
 * ClassLibrary
 */
public class ClassLibrary {
    public enum EntityClass {SpiderClass, PlayerClass, GiantClass};
    public static double ClassHealthLibrary (EntityClass entityClass) {
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