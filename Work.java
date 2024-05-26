public class Work {
    /**
     * @param force        - the force applied on the object in newtons
     * 
     * @param displacement - the displacement on the object in meters
     * 
     * @return the work done on the object in joules
     */
    public static double work(double force, double displacement) {
        return force * displacement;
    }

    /**
     * 
     * @param force        - the force applied on the object in newtons
     * 
     * @param displacement - the displacement on the object in meters
     * 
     * @param theta        - the angle of applied force in degrees
     * 
     * @return the work done on the object in joules
     */
    public static double work(double force, double displacement, double theta) {
        return force * displacement * Math.cos(theta);
    }
}