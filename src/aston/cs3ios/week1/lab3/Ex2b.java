package aston.cs3ios.week1.lab3;
import java.util.Scanner;

public class Ex2b {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner kin = new Scanner(System.in);

        // Prompt the user to enter a floating-point number
        System.out.print("Please enter a floating-point number: ");

        // Read the user's input for a floating-point number and store it in a variable called 'input'
        double input = kin.nextDouble();

        // Format the input to 3 decimal places using String.format
        String formattedInput = String.format("%.3f", input);

        // Print the formatted input
        System.out.println("Your input is " + formattedInput);
    }
}
