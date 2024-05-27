package Player;

import GUI.UserInterface;
import Map.*;
import MovementStatus.MovementDecision;
import Vehicle.Vehicle;

import GUI.ConsoleInterface;
import java.util.ArrayList;

/**
 * Represents a player in the traffic simulation game. This class allows a player
 * to interact with the game world, including making decisions about vehicle movement,
 * observing the surroundings, and responding to game challenges.
 */
public class Player {

    //Variables
    TrafficNetwork trafficNetwork = new TrafficNetwork();
    private Vehicle vehicle;
    private UserInterface userInterface;
    /**
     * Retrieves the vehicle currently controlled by the player.
     *
     * @return The {@link Vehicle} object controlled by the player.
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Assigns a vehicle for the player to control.
     *
     * @param vehicle The {@link Vehicle} to be controlled by the player.
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    /**
     * Provides information about the immediate surroundings of the player's vehicle,
     * such as nearby vehicles in the current road segment or intersection.
     */
    public void lookAround(){
        ArrayList<RoadSegment> currentSegment = trafficNetwork.getRoads();
        ArrayList<Intersection> currentIntersection = trafficNetwork.getIntersections();
        if (currentSegment != null) {
            int vehiclesInSegment = trafficNetwork.checkNumberVehiclesInSegment(currentSegment);
            System.out.println("Vehicles in current segment: " + vehiclesInSegment);
        }
        if (currentIntersection != null) {
            int vehiclesAtIntersection = trafficNetwork.checkNumberVehiclesAtIntersection(currentIntersection);
            System.out.println("Vehicles at current intersection: " + vehiclesAtIntersection);
        }
    }  // Method for LOOKING
    /**
     * Validates the player's movement decision based on the current state of the game world.
     *
     * @param decision The {@link MovementDecision} made by the player.
     * @return true if the decision is valid and can be executed, false otherwise.
     */
    public boolean isMoveValid(MovementDecision decision) {
        switch (decision) {
            case CHANGE_LANE_LEFT:
                return canChangeLaneLeft();
            case CHANGE_LANE_RIGHT:
                return canChangeLaneRight();
            case TURN_LEFT:
                return canTurnLeft();
            case TURN_RIGHT:
                return canTurnRight();
            case KEEP_STRAIGHT:
                return canKeepStraight();
            default:
                return false;
        }
    }  //Method for Assertion
    /**
     * Executes the player's movement decision if it is validated as a valid move.
     *
     * @param decision The {@link MovementDecision} to be executed.
     */
    public void makeMovementDecision(MovementDecision decision) {
        if (isMoveValid(decision)) {
            switch (decision) {
                case CHANGE_LANE_LEFT:
                    changeLaneLeft(vehicle);
                    break;
                case CHANGE_LANE_RIGHT:
                    changeLaneRight(vehicle);
                    break;
                case TURN_RIGHT:
                    turnRight(vehicle);
                    break;
                case TURN_LEFT:
                    turnLeft(vehicle);
                    break;
                case KEEP_STRAIGHT:
                    keepStraight(vehicle);
                    break;
            }
        }else {
            System.out.println("Move is not valid");
        }
    }  // Method for MovementDecision
    /**
     * Determines if the player's vehicle can safely change lanes to the left.
     *
     * @return {@code true} if the lane change to the left is possible and safe, {@code false} otherwise.
     */
    /**
     * Determines if the player's vehicle can safely change lanes to the left.
     *
     * @return {@code true} if the lane change to the left is possible and safe, {@code false} otherwise.
     */
    public boolean canChangeLaneLeft(){
        // Implementation details...
        return false;
    }

    /**
     * Determines if the player's vehicle can safely change lanes to the right.
     *
     * @return {@code true} if the lane change to the right is possible and safe, {@code false} otherwise.
     */
    public boolean canChangeLaneRight(){
        // Implementation details...
        return false;
    }

    /**
     * Determines if the player's vehicle can safely turn left at the next opportunity.
     *
     * @return {@code true} if turning left is possible and safe, {@code false} otherwise.
     */
    public boolean canTurnLeft(){
        // Implementation details...
        return false;
    }

    /**
     * Determines if the player's vehicle can safely turn right at the next opportunity.
     *
     * @return {@code true} if turning right is possible and safe, {@code false} otherwise.
     */
    public boolean canTurnRight(){
        // Implementation details...
        return false;
    }

    /**
     * Determines if the player's vehicle can continue moving straight ahead safely.
     *
     * @return {@code true} if continuing straight is possible and safe, {@code false} otherwise.
     */
    public boolean canKeepStraight(){
        // Implementation details...
        return false;
    }

    /**
     * Executes the action of changing lanes to the left for the player's vehicle.
     *
     * @param vehicle The player's vehicle attempting to change lanes.
     */
    public void changeLaneLeft(Vehicle vehicle){
        // Implementation details...
    }

    /**
     * Executes the action of changing lanes to the right for the player's vehicle.
     *
     * @param vehicle The player's vehicle attempting to change lanes.
     */
    public void changeLaneRight(Vehicle vehicle){
        // Implementation details...
    }

    /**
     * Executes the action of turning right for the player's vehicle.
     *
     * @param vehicle The player's vehicle attempting to turn right.
     */
    public void turnRight(Vehicle vehicle){
        // Implementation details...
    }

    /**
     * Executes the action of turning left for the player's vehicle.
     *
     * @param vehicle The player's vehicle attempting to turn left.
     */
    public void turnLeft(Vehicle vehicle){
        // Implementation details...
    }

    /**
     * Executes the action of keeping the player's vehicle moving straight.
     *
     * @param vehicle The player's vehicle that continues to move straight.
     */
    public void keepStraight(Vehicle vehicle){
        // Implementation details...
    }

    /**
     * Initiates a challenge for the player. This method represents an opportunity for the player
     * to engage in a specific game scenario or task that could influence the outcome of the game.
     */
    public void challenge(){
        // Implementation details...
    }
}