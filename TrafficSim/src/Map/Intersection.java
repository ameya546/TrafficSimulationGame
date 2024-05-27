package Map;

import java.util.ArrayList;

/**
 * Represents an intersection within the traffic network, extending the generic
 * {@link TrafficElement}. An intersection is a key component of the traffic network,
 * typically where multiple {@link RoadSegment} instances meet or cross.
 */
public class Intersection extends TrafficElement {

    /**
     * A list of {@link RoadSegment} objects that connect to this intersection.
     */
    private ArrayList<RoadSegment> roads;

    /**
     * Retrieves the list of road segments that are connected to this intersection.
     * This list represents the physical roads entering or exiting the intersection.
     *
     * @return An {@link ArrayList} of {@link RoadSegment} objects connected to this intersection.
     */
    public ArrayList<RoadSegment> getRoads() {
        return roads;
    }

    /**
     * Sets the list of road segments that are connected to this intersection.
     * This method allows for the dynamic modification of an intersection's connected roads,
     * facilitating updates to the traffic network's structure.
     *
     * @param roads An {@link ArrayList} of {@link RoadSegment} objects to be associated with
     *              this intersection. Should not be {@code null}.
     */
    public void setRoads(ArrayList<RoadSegment> roads) {
        this.roads = roads;
    }
}