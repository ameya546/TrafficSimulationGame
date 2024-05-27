package Vehicle;
import MovementStatus.MovementStatus;
/**
 * An abstract representation of a vehicle, providing a foundation for specific vehicle
 * types within the simulation. This class encapsulates common attributes and behaviors
 * that all vehicles share, such as movement capabilities, physical characteristics,
 * and status attributes like reputation and damage.
 */
public abstract class Vehicle {

    /**
     * The current movement status of the vehicle, encapsulating position, speed, and direction.
     */
    private MovementStatus movementStatus;

    /**
     * The color of the vehicle.
     */
    private String color;

    /**
     * The size of the vehicle. This could represent volume, length, or another appropriate measure.
     */
    private double size;

    /**
     * The weight of the vehicle.
     */
    private double weight;

    /**
     * The maximum speed the vehicle can achieve.
     */
    private double maxSpeed;

    /**
     * The reputation of the vehicle or its driver, affecting interactions with other entities.
     */
    private Reputation reputation;

    /**
     * The current damage status of the vehicle, tracking both suffered and inflicted damage.
     */
    private DamageStatus damageStatus;

    /**
     * Retrieves the current movement status of the vehicle.
     *
     * @return The {@link MovementStatus} of the vehicle.
     */
    public MovementStatus getMovementStatus() {
        return movementStatus;
    }
    /**
     * Sets the movement status of the vehicle.
     *
     * @param movementStatus The new {@link MovementStatus} to assign to the vehicle.
     */
    public void setMovementStatus(MovementStatus movementStatus) {
        this.movementStatus = movementStatus;
    }
    /**
     * Retrieves the color of the vehicle.
     *
     * @return The color of the vehicle.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the vehicle.
     *
     * @param color The new color of the vehicle.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Retrieves the size of the vehicle.
     *
     * @return The size of the vehicle.
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the vehicle.
     *
     * @param size The new size of the vehicle.
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Retrieves the weight of the vehicle.
     *
     * @return The weight of the vehicle.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the vehicle.
     *
     * @param weight The new weight of the vehicle.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Retrieves the maximum speed of the vehicle.
     *
     * @return The maximum speed of the vehicle.
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets the maximum speed of the vehicle.
     *
     * @param maxSpeed The new maximum speed of the vehicle.
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Retrieves the reputation of the vehicle.
     *
     * @return The {@link Reputation} object associated with the vehicle.
     */
    public Reputation getReputation() {
        return reputation;
    }

    /**
     * Sets the reputation of the vehicle.
     *
     * @param reputation The new {@link Reputation} of the vehicle.
     */
    public void setReputation(Reputation reputation) {
        this.reputation = reputation;
    }

    /**
     * Retrieves the damage status of the vehicle.
     *
     * @return The {@link DamageStatus} object associated with the vehicle.
     */
    public DamageStatus getDamageStatus() {
        return damageStatus;
    }

    /**
     * Sets the damage status of the vehicle.
     *
     * @param damageStatus The new {@link DamageStatus} of the vehicle.
     */
    public void setDamageStatus(DamageStatus damageStatus) {
        this.damageStatus = damageStatus;
    }

    /**
     * Defines the behavior for moving the vehicle. Implementations should specify
     * how the vehicle moves based on its current status and the environment.
     */
    public void move() {
        // Specific implementation details should be provided in subclasses.
    }
}