package brainblasted.JavaAdventure.Properties;

import brainblasted.JavaAdventure.Properties.ClassLibrary;
import brainblasted.JavaAdventure.Properties.ClassLibrary.EntityClass;

/**
 * Health
 */
public class Health {

    public static double EntityHealth (EntityClass classOfEntity) {
        double health = ClassLibrary.ClassHealthLibrary(classOfEntity);
        return health;
    }
}