package Game;

import Vehicle.*;
import Map.TrafficNetwork;

/**
 * The {@code ChallengeHandler} class is responsible for managing challenges within the game.
 * It will implement the gambling functionalities
 */
public class ChallengeHandler {

    /**
     * Executes a challenge for the specified vehicle within the given traffic network.
     *
     * @param vehicle the {@link Vehicle} participating in the challenge.
     * @param trafficNetwork the {@link TrafficNetwork} where the challenge takes place.
     * @return the updated {@link TrafficNetwork} after the challenge has been processed.
     */
    public TrafficNetwork runChallenge(Vehicle vehicle, TrafficNetwork trafficNetwork){
        // Challenge logic implementation
        return trafficNetwork;
    }
    /**
     * Identifies neighboring vehicles around the specified vehicle within the traffic network.
     *
     * @param vehicle the {@link Vehicle} for which to find neighbors.
     * @return the {@link Vehicle} identified as a neighbor.
     */
    private Vehicle findNeighbours(Vehicle vehicle){
        // Neighbor finding logic
        return vehicle;
    }
}