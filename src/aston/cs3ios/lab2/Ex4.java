package aston.cs3ios.lab2;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner kin = new Scanner(System.in);

        // Prompt the user for the height in meters
        System.out.print("Enter your height in m: ");
        double height = kin.nextDouble();

        // Prompt the user for the weight in kilograms
        System.out.print("Enter your weight in kg: ");
        double weight = kin.nextDouble();

        // Calculate BMI using the formula: BMI = weight (kg) / (height (m) * height (m))
        double bmi = weight / (height * height);

        // Print the BMI to 2 decimal places
        System.out.printf("Your BMI is %.2f%n", bmi);
    }
}