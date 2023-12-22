package ro.itschool.sessions2.mathsystem;

import java.io.Console;

public class ConsoleExample {

    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            char[] password = console.readPassword("Enter the password: ");
            console.format("You entered the password: snns", new String(password));
        } else {
            System.out.println("The console is not available. You cannot read the password.");
        }
    }
}