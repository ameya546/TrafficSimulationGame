package Vehicle;
/**
 * Represents a bus in the vehicle simulation. This class extends the {@link Vehicle}
 * class, adding properties and methods specific to buses, such as handling the number of passengers.
 */
public class Bus extends Vehicle {

    /**
     * The number of passengers currently on the bus.
     */
    private double numberPassengers; // Consider changing the type to int if fractional passengers are not intended.

    /**
     * Retrieves the number of passengers currently on the bus.
     *
     * @return The current number of passengers.
     */
    public double getNumberPassengers() {
        return numberPassengers;
    }

    /**
     * Sets the number of passengers currently on the bus.
     *
     * @param numberPassengers The new number of passengers. This value should be non-negative.
     */
    public void setNumberPassengers(double numberPassengers) {
        this.numberPassengers = numberPassengers;
    }
}