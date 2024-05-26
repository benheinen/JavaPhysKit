public class NewtonsLaws {
    /**
     * Calculates force using Newton's Second Law
     * 
     * @param mass         - the mass of the object in kilograms
     * 
     * @param acceleration - the accleration of the object in meters squared
     * 
     * @return the force of the object in newtons
     */
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    /**
     * Calculates mass using Newton's Second Law
     * 
     * @param force        - the force applied to the object in newtons
     * 
     * @param acceleration - the accleration of the object in meters squared
     * 
     * @return the mass of the object in kilograms
     */
    public static double calculateMass(double force, double acceleration) {
        return force / acceleration;
    }

    /**
     * Calculates acceleration using Newton's Second Law
     * 
     * @param force - the force applied to the object in newtons
     * 
     * @param mass  - the mass of the object in kilograms
     * 
     * @return the acceleration of the object in meters squared
     */
    public static double calculateAcceleration(double force, double mass) {
        return force / mass;
    }

    /**
     * Calculates equal but opposite force applied on an object
     * 
     * @param force - the force applied to the object in newtons
     * 
     * @param mass  - the mass of the object in kilograms
     * 
     * @return the opposite of the force applied on an object
     */
    public static double newtonsThirdLaw(double force) {
        return -force;
    }
}