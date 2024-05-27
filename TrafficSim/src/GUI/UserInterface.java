package GUI;
/**
 * The UserInterface interface defines the methods required for interacting
 * with the user, regardless of the specific user interface implementation (e.g., console, graphical user interface).
 * It specifies how messages should be displayed to the user, how to collect input from the user,
 * and how to display error messages.
 */
public interface UserInterface {

    /**
     * Displays a message to the user. This method is intended for general information,
     * feedback, or instructions that need to be communicated to the user.
     *
     * @param message The message to be displayed to the user. Should not be {@code null}.
     */
    void displayMessage(String message);

    /**
     * Prompts the user for input by displaying a specified prompt message. This method
     * should block and wait until the user has provided an input, and then return the input as a String.
     *
     * @param prompt The prompt message to display to the user before waiting for input.
     *               The prompt should not be {@code null}.
     * @return The input provided by the user as a String.
     */
    String getInput(String prompt);

    /**
     * Displays an error message to the user. This method is used for communicating errors
     * or issues that have occurred during the application's execution.
     *
     * @param message The error message to be displayed to the user. Should not be {@code null}.
     */
    void displayError(String message);
}