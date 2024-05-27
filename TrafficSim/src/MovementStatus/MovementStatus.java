package MovementStatus;

/**
 * Represents the movement status of an entity within the application, such as a vehicle
 * in a traffic simulation. It encapsulates the entity's current position, speed, and
 * direction of movement.
 */
public class MovementStatus {
    /**
     * The current position of the entity, represented by a {@link Position} object.
     */
    private Position position;

    /**
     * The current speed of the entity. Speed is represented as a double value.
     */
    private double speed;

    /**
     * The current direction of the entity's movement, represented by a {@link Direction} enum.
     */
    private Direction direction;

    /**
     * Retrieves the current position of the entity.
     *
     * @return The current {@link Position} of the entity.
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the current position of the entity.
     *
     * @param position The new {@link Position} of the entity.
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * Retrieves the current speed of the entity.
     *
     * @return The current speed of the entity as a double.
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Sets the current speed of the entity.
     *
     * @param speed The new speed of the entity, represented as a double.
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Retrieves the current direction of the entity's movement.
     *
     * @return The current {@link Direction} of the entity's movement.
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Sets the current direction of the entity's movement.
     *
     * @param direction The new {@link Direction} of the entity's movement.
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}