package GUI;
import java.util.Scanner;
/**
 * ConsoleInterface provides a simple console-based user interface
 * by implementing the UserInterface. It utilizes standard input and output
 * to interact with the user, allowing for messages to be displayed and input to be collected.
 */
public class ConsoleInterface implements UserInterface {

    private final Scanner scanner;

    /**
     * Constructs a new ConsoleInterface instance, initializing the scanner
     * to read input from the standard input stream (console).
     */
    public ConsoleInterface() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Displays a message to the user via the console's standard output.
     *
     * @param message The message to be displayed. Cannot be {@code null}.
     */
    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    /**
     * Prompts the user with a message and returns the input provided by the user.
     * The method does not return until the user has entered an input line.
     *
     * @param prompt The message used to prompt the user for input. Cannot be {@code null}.
     * @return The input line entered by the user.
     */
    @Override
    public String getInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    /**
     * Displays an error message to the user via the console's standard error output.
     *
     * @param message The error message to be displayed. Cannot be {@code null}.
     */
    @Override
    public void displayError(String message) {
        System.err.println(message);
    }
}