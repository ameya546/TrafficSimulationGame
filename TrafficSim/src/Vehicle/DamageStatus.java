package Vehicle;

import java.util.ArrayList;

/**
 * Manages and tracks the damage status of a vehicle. This includes the current damage status
 * as well as the history of damage the vehicle has suffered and inflicted on others.
 */
public class DamageStatus {

    /**
     * The current damage status of the vehicle. This could be represented as a percentage
     * or another metric indicating the extent of damage.
     */
    private double currentStatus;

    /**
     * A history of the damage values the vehicle has suffered over time.
     */
    private ArrayList<Double> sufferedDamageHistory;

    /**
     * A history of the damage values the vehicle has inflicted on other vehicles over time.
     */
    private ArrayList<Double> generatedDamageHistory;

    /**
     * Retrieves the current damage status of the vehicle.
     *
     * @return The current damage status.
     */
    public double getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the current damage status of the vehicle.
     *
     * @param currentStatus The new damage status to be set.
     */
    public void setCurrentStatus(double currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * Retrieves the history of damage the vehicle has suffered.
     *
     * @return A new {@link ArrayList} containing the history of suffered damage.
     */
    public ArrayList<Double> getSufferedDamageHistory() {
        return new ArrayList<>(sufferedDamageHistory);
    }

    /**
     * Sets the history of damage the vehicle has suffered.
     *
     * @param sufferedDamageHistory An {@link ArrayList} containing the new history of suffered damage.
     */
    public void setSufferedDamageHistory(ArrayList<Double> sufferedDamageHistory) {
        this.sufferedDamageHistory = new ArrayList<>(sufferedDamageHistory);
    }

    /**
     * Retrieves the history of damage the vehicle has inflicted on others.
     *
     * @return A new {@link ArrayList} containing the history of inflicted damage.
     */
    public ArrayList<Double> getGeneratedDamageHistory() {
        return new ArrayList<>(generatedDamageHistory);
    }

    /**
     * Sets the history of damage the vehicle has inflicted on others.
     *
     * @param generatedDamageHistory An {@link ArrayList} containing the new history of inflicted damage.
     */
    public void setGeneratedDamageHistory(ArrayList<Double> generatedDamageHistory) {
        this.generatedDamageHistory = new ArrayList<>(generatedDamageHistory);
    }

    // Additional methods documentation...

    /**
     * Updates the current damage status of the vehicle based on new damage incurred.
     * This method should incorporate the new damage into both the current status
     * and the suffered damage history.
     *
     * @param damage The amount of new damage to be added to the current status.
     */
    public void updateDamageStatus(double damage){
        // Implementation details...
    }

    /**
     * Calculates the total damage this vehicle has suffered from another specified vehicle.
     *
     * @param otherVehicle The vehicle from which the damage originated.
     * @return The total damage suffered from the specified vehicle.
     */
    public double calculateSufferedDamage(Vehicle otherVehicle){
        // Implementation details...
        return 0;
    }

    /**
     * Calculates the total damage this vehicle has inflicted on another specified vehicle.
     *
     * @param otherVehicle The vehicle that received the damage.
     * @return The total damage inflicted on the specified vehicle.
     */
    public double calculateGeneratedDamage(Vehicle otherVehicle){
        // Implementation details...
        return 0;
    }
}
