package MovementStatus;

import Map.Point;
import Map.TrafficElement;


/**
 * Represents the position of an entity within the map or traffic network. This class
 * encapsulates both a reference to a specific {@link TrafficElement} (e.g., a road segment
 * or intersection) and a precise {@link Point} coordinate, offering a comprehensive
 * description of location within the simulation environment.
 */
public class Position {
    /**
     * The traffic element (e.g., road segment or intersection) associated with this position.
     */
    private TrafficElement trafficElement;

    /**
     * The precise coordinate of this position within the map or traffic network.
     */
    private Point coordinate;

    /**
     * Retrieves the traffic element associated with this position.
     *
     * @return The {@link TrafficElement} associated with this position.
     */
    public TrafficElement getTrafficElement() {
        return trafficElement;
    }

    /**
     * Sets the traffic element associated with this position.
     *
     * @param trafficElement The {@link TrafficElement} to be associated with this position.
     */
    public void setTrafficElement(TrafficElement trafficElement) {
        this.trafficElement = trafficElement;
    }

    /**
     * Retrieves the coordinate of this position.
     *
     * @return The {@link Point} representing the coordinate of this position.
     */
    public Point getCoordinate() {
        return coordinate;
    }

    /**
     * Sets the coordinate of this position.
     *
     * @param coordinate The {@link Point} representing the new coordinate of this position.
     */
    public void setCoordinate(Point coordinate) {
        this.coordinate = coordinate;
    }
}
