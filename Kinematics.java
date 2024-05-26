public class Kinematics {
    /**
     * 
     * Calculates the final velocity of an object using Kinematics
     * 
     * @param initialVelocity - the initial velocity of the object in meters
     * 
     * @param acceleration    - the acceleration of the object in meters squared
     * 
     * @param time            - the amount of time passed in seconds
     * 
     * @return the final velocity of the object in meters
     */
    public static double calculateFinalVelocity(double initialVelocity, double acceleration, double time) {
        return initialVelocity + (acceleration * time);
    }

    /**
     * 
     * Calculates the squared final velocity of an object using Kinematics
     * 
     * @param initialVelocity - the initial velocity of the object in meters
     * 
     * @param acceleration    - the acceleration of the object in meters squared
     * 
     * @param displacement    - the displacement of the object in meters
     * 
     * @return the final velocity of the object in meters squared
     */
    public static double calculateFinalVelocitySquared(double initialVelocity, double acceleration,
            double displacement) {
        return (initialVelocity * initialVelocity) + (2 * acceleration * displacement);
    }

    /**
     * 
     * Calculates displacement of an object using the acceleration of an object
     * 
     * @param initialVelocity - the initial velocity of the object in meters
     * 
     * @param time            - the amount of time passed in seconds
     * 
     * @param acceleration    - the acceleration of the object in meters squared
     * 
     * @return the displacement of the object in meters
     */
    public static double calculateDisplacementAcceleration(double initialVelocity, double time, double acceleration) {
        return (initialVelocity * time) + (0.5 * acceleration * time * time);
    }

    /**
     * 
     * Calculates displacement of an object using the final velocity of an object
     * 
     * @param initialVelocity - the initial velocity of the object in meters
     * 
     * @param finalVelocity   - the final velocity of the object in meters
     * 
     * @param time            - the amount of time passed in seconds
     * 
     * @return the displacement of the object in meters
     */
    public static double calculateDisplacementFinalVelocity(double initialVelocity, double finalVelocity, double time) {
        return 0.5 * (initialVelocity + finalVelocity) * time;
    }
}