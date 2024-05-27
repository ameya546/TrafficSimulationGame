package MovementStatus;

/**
 * Enumerates the possible movement decisions that can be made by a vehicle within
 * the traffic simulation. This includes changing lanes, turning, and maintaining the
 * current direction of travel.
 */
public enum MovementDecision {
    /**
     * Indicates a decision to change lanes to the left.
     */
    CHANGE_LANE_LEFT,

    /**
     * Indicates a decision to change lanes to the right.
     */
    CHANGE_LANE_RIGHT,

    /**
     * Indicates a decision to turn the vehicle to the right.
     */
    TURN_RIGHT,

    /**
     * Indicates a decision to turn the vehicle to the left.
     */
    TURN_LEFT,

    /**
     * Indicates a decision to keep moving straight, without changing lanes or turning.
     */
    KEEP_STRAIGHT
}