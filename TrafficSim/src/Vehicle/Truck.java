package Vehicle;
/**
 * Represents a truck in the vehicle simulation, extending the generic {@link Vehicle} class.
 * This class introduces additional functionality specific to trucks, such as the ability
 * to carry cargo. It provides methods to manage the truck's cargo capacity.
 */
public class Truck extends Vehicle {

    /**
     * The amount of cargo currently loaded on the truck. This is represented as a double,
     * potentially allowing for partial units of cargo, depending on the simulation requirements.
     */
    private double cargo;

    /**
     * Retrieves the current cargo load of the truck.
     *
     * @return The amount of cargo currently on the truck.
     */
    public double getCargo() {
        return cargo;
    }

    /**
     * Sets the current cargo load of the truck. This method allows for the modification
     * of the truck's cargo, which could be used to simulate loading and unloading operations.
     *
     * @param cargo The new amount of cargo to set on the truck.
     */
    public void setCargo(double cargo) {
        this.cargo = cargo;
    }
}