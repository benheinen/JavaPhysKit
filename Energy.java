public class Energy {
    /**
     * 
     * @param velocity - the velocity of the object in meters per second
     * 
     * @param mass     - the mass of the object in kilograms
     * 
     * @return the kinetic energy of the object in joules
     */
    public static double calculateKinetic(double velocity, double mass) {
        return 0.5 * mass * velocity * velocity;
    }

    /**
     * 
     * @param mass   - the mass of the object in kilograms
     * 
     * @param height - the height of the object in meters
     * 
     * @return the potential energy of the object in joules
     */
    public static double calculatePotential(double mass, double height) {
        return Constants.GRAVITY_EARTH * mass * height;
    }

    /**
     * 
     * @param kineticEnergy   - the kinetic energy of the object in joules
     * 
     * @param potentialEnergy - the potential energy of the object in joules
     * 
     * @return the total mechanical energy of the object in joules
     */
    public static double calculateMechanical(double kineticEnergy, double potentialEnergy) {
        return kineticEnergy + potentialEnergy;
    }
}
