public class Power {
    /**
     * 
     * @param work - the work applied in joules
     * 
     * @param time - the duration work is applied in seconds
     * 
     * @return the amount of power in watts (joules/seconds)
     */
    public static double calculate(double work, double time) {
        return work / time;
    }

    /**
     * 
     * @param force        - the force applied in newtons
     * 
     * @param displacement - the displacement of the object in meters
     * 
     * @param time         - the duration work is applied in seconds
     * 
     * @return the amount of power in watts (joules/seconds)
     */
    public static double calculate(double force, double displacement, double time) {
        return (force * displacement) / time;
    }
}
