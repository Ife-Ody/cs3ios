package aston.cs3ios.week1.lab3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Define the format string for DecimalFormat
        String formatString = "#.#";

        // Create a Scanner object to read input from the user
        Scanner kin = new Scanner(System.in);

        // Create a DecimalFormat object using the specified format string
        DecimalFormat df = new DecimalFormat(formatString);

        // Prompt the user to enter a double value
        System.out.print("Enter a double value: ");

        // Read the user's input for a double value and store it in a variable called 'input'
        double input = kin.nextDouble();

        // Format the input according to the format string
        String result = df.format(input);

        // Print the formatted result
        System.out.println("Your input is " + result);
    }
}
