package Map;

import MovementStatus.Direction;

/**
 * Represents a lane within a road segment, extending the generic {@link TrafficElement}.
 * A lane is a distinct part of a road designated for use by a single line of vehicles,
 * where control and direction are significant for traffic management and safety.
 */
public class Lane extends TrafficElement {
    /**
     * The length of the lane, typically measured in meters or kilometers.
     */
    private double length;

    /**
     * The direction of travel allowed in this lane, represented by the {@link Direction} enum.
     */
    private Direction direction;

    /**
     * Retrieves the length of this lane.
     *
     * @return The length of the lane, in the unit of measurement used (e.g., meters or kilometers).
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of this lane. This is typically used when creating or modifying the
     * characteristics of a lane within the traffic network.
     *
     * @param length The new length of the lane, which should be a positive number.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Retrieves the direction of travel allowed in this lane.
     *
     * @return The {@link Direction} of travel for this lane.
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Sets the direction of travel for this lane. This method allows for the specification
     * or modification of the allowed direction of travel, which is critical for traffic
     * management and safety within the network.
     *
     * @param direction The {@link Direction} to be set for this lane.
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
