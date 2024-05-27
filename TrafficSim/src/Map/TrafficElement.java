package Map;

    /**
    * Represents an abstract base class for all elements within the traffic network.
    * This class provides a foundational attribute for specifying the position of traffic elements
    * on the map, allowing derived classes to inherit and extend this basic functionality with
     * specific behaviors and properties.
     */
public abstract class TrafficElement {

    /**
     * The position of the traffic element on the map, represented by a {@link Point}
     * object that encapsulates the x and y coordinates.
     */
    private final Point mapPosition;

    /**
     * Constructor for TrafficElement that sets the initial position.
     *
     * @param mapPosition The initial {@link Point} object representing the position of the element on the map.
     */
    public TrafficElement(Point mapPosition) {
        this.mapPosition = mapPosition;
    }

    /**
     * Retrieves the map position of this traffic element.
     *
     * @return The {@link Point} object representing the current position of the element on the map.
     */
    public Point getMapPosition() {
        return mapPosition;

    }
}