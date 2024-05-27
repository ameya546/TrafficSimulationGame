package Vehicle;

/**
 * Represents a car in the vehicle simulation. This class extends the {@link Vehicle}
 * superclass, incorporating car-specific properties, such as the number of doors.
 */
public class Car extends Vehicle {

    /**
     * The number of doors on the car. While typically an integer, it's represented as a double
     * for flexibility in simulation scenarios.
     */
    private double numberDoors;

    /**
     * Retrieves the number of doors on the car.
     *
     * @return The number of doors.
     */
    public double getNumberDoors() {
        return numberDoors;
    }

    /**
     * Sets the number of doors on the car. This value should be positive and reflect
     * the design of the car being simulated.
     *
     * @param numberDoors The new number of doors on the car.
     */
    public void setNumberDoors(double numberDoors) {
        this.numberDoors = numberDoors;
    }
}