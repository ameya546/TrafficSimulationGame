package Map;

import java.util.ArrayList;

/**
 * Represents a segment of a road within the traffic network. A road segment is defined
 * by its connections to intersections and contains one or more lanes that facilitate vehicle
 * movement. This class provides the structure for managing the lanes and intersections
 * associated with a particular segment of road.
 */
public class RoadSegment {
    /**
     * A list of intersections that this road segment connects to. Intersections are crucial
     * for defining the road network's topology, allowing vehicles to navigate from one
     * road segment to another.
     */
    private ArrayList<Intersection> intersections;

    /**
     * A list of lanes that are part of this road segment. Each lane allows for vehicle
     * travel in a specified direction, and multiple lanes may support higher traffic volumes
     * or different types of vehicles.
     */
    private ArrayList<Lane> lanes;

    /**
     * Retrieves a list of intersections connected to this road segment. The returned list
     * is a copy to prevent external modifications to the road segment's internal state.
     *
     * @return A new {@link ArrayList} of {@link Intersection} objects connected to this road segment.
     */
    public ArrayList<Intersection> getIntersections() {
        return new ArrayList<>(intersections);
    }

    /**
     * Sets the intersections connected to this road segment. This method allows for the dynamic
     * modification of a road segment's topology within the traffic network.
     *
     * @param intersections An {@link ArrayList} of {@link Intersection} objects to be associated
     *                      with this road segment.
     */
    public void setIntersections(ArrayList<Intersection> intersections) {
        this.intersections = new ArrayList<>(intersections);
    }

    /**
     * Retrieves a list of lanes that are part of this road segment. Similar to intersections,
     * the returned list is a copy to ensure encapsulation and prevent unintended external changes.
     *
     * @return A new {@link ArrayList} of {@link Lane} objects that belong to this road segment.
     */
    public ArrayList<Lane> getLanes() {
        return new ArrayList<>(lanes);
    }

    /**
     * Sets the lanes that comprise this road segment. This method enables the configuration
     * of a road segment's lane structure, affecting traffic flow and vehicle movement.
     *
     * @param lanes An {@link ArrayList} of {@link Lane} objects to be included in this road segment.
     */
    public void setLanes(ArrayList<Lane> lanes) {
        this.lanes = new ArrayList<>(lanes);
    }
}