package aston.cs3ios.week1.lab3;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner kin = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Please enter first number: ");

        // Read the user's input for the first number and store it in a variable called 'x'
        int x = kin.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Please enter second number: ");

        // Read the user's input for the second number and store it in a variable called 'y'
        int y = kin.nextInt();

        // Calculate the result of x raised to the power of y using Math.pow
        double result = Math.pow(x, y);

        // Print the result as an integer (casting the double result to an integer)
        System.out.println((int) result);
    }
}

