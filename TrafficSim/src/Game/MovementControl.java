package Game;
import MovementStatus.Position;
import Vehicle.*;
import Map.*;

import java.util.ArrayList;

/**
 * The MovementControl interface defines the operations necessary for managing and controlling
 * vehicle movements within a simulated traffic network. Implementing classes are responsible
 * for updating vehicle positions, validating movement decisions, and analyzing the traffic environment.
 */
public interface MovementControl {

        /**
         * Updates the positions of a list of vehicles within the specified traffic network.
         *
         * @param trafficNetwork The traffic network within which the vehicles are moving.
         * @param vehicles The list of vehicles whose positions are to be updated.
         * @return An {@link ArrayList} of {@link Vehicle} objects with their updated positions.
         */
        ArrayList<Vehicle> updateVehiclesPosition(TrafficNetwork trafficNetwork, ArrayList<Vehicle> vehicles);

        /**
         * Checks the immediate region around a specific vehicle and identifies other vehicles
         * that are in close proximity.
         *
         * @param vehicle The vehicle for which the surrounding region is being checked.
         * @param vehicles A list of vehicles to consider when checking the region.
         * @return An {@link ArrayList} of {@link Vehicle} objects that are located near the specified vehicle.
         */
        ArrayList<Vehicle> checkRegion(Vehicle vehicle, ArrayList<Vehicle> vehicles);

        /**
         * Validates a vehicle's proposed new position within the traffic network to ensure it is a
         * feasible and safe move, given the current traffic conditions and network constraints.
         *
         * @param vehicle The vehicle attempting to move.
         * @param newPosition The proposed new position for the vehicle.
         * @return The {@link Position} object representing the validated position for the vehicle. This
         *         may be the same as the proposed position if the move is valid, or an adjusted position.
         */
        Position validateMoveChoice(Vehicle vehicle, Position newPosition);

        /**
         * Probes the map for traffic elements (such as other vehicles, traffic signs, or obstacles)
         * that are in the vicinity of the specified vehicle. This information can be used to make
         * informed movement decisions.
         *
         * @param vehicle The vehicle for which the surroundings are being probed.
         * @return An {@link ArrayList} of {@link TrafficElement} objects representing the traffic
         * elements found near the specified vehicle.
         */
        ArrayList<TrafficElement> probeMapSurroundings(Vehicle vehicle);
}