package Vehicle;

import java.util.ArrayList;

/**
 * Manages the reputation of a vehicle or driver, quantified by a "niceness" score.
 * This class tracks changes to the reputation over time, allowing for analysis of
 * behavior patterns and potentially influencing interactions with other vehicles or entities.
 */
public class Reputation {

    /**
     * The current "niceness" score, representing the reputation of the vehicle or driver.
     * A higher score may indicate more cooperative or friendly behavior.
     */
    private double niceness;

    /**
     * A history of niceness scores, tracking changes to the vehicle's or driver's
     * reputation over time.
     */
    private ArrayList<Double> reputationHistory;

    /**
     * Constructs a new Reputation instance with default initial values.
     * Initializes the niceness score to 0 and sets up an empty history of reputation changes.
     */
    public Reputation() {
        this.niceness = 0.0; // Default value, assuming it starts from 0
        this.reputationHistory = new ArrayList<>(); // Initialize the history list
    }

    /**
     * Retrieves the current niceness score.
     *
     * @return The current niceness score.
     */
    public double getNiceness() {
        return niceness;
    }

    /**
     * Sets the niceness score to a new value and records this change in the reputation history.
     *
     * @param niceness The new niceness score to be set.
     */
    public void setNiceness(double niceness) {
        this.niceness = niceness;
        // Optionally, add this change to the reputation history
        this.reputationHistory.add(niceness);
    }

    /**
     * Retrieves the history of niceness scores, showing how the reputation has changed over time.
     * Returns a copy of the history to prevent external modifications.
     *
     * @return A new {@link ArrayList} containing the history of niceness scores.
     */
    public ArrayList<Double> getReputationHistory() {
        // Returning a new ArrayList to prevent external modifications
        return new ArrayList<>(reputationHistory);
    }

    /**
     * Replaces the current reputation history with a new set of niceness scores.
     * This method allows for resetting or bulk updating the history and encapsulates
     * the internal list to prevent unintended modifications.
     *
     * @param reputationHistory A new {@link ArrayList} of niceness scores to set as the reputation history.
     */
    public void setReputationHistory(ArrayList<Double> reputationHistory) {
        // Creating a new ArrayList from the provided one to encapsulate the internal list
        this.reputationHistory = new ArrayList<>(reputationHistory);
    }
}
