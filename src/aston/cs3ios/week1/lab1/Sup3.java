package aston.cs3ios.week1.lab1;
/*
3. Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output
*/
import java.util.Scanner;

public class Sup3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner kin = new Scanner(System.in);

        // Print an introduction message to explain the program's purpose
        System.out.println("This program divides two numbers (x) and (y)");

        // Prompt the user to enter the value of x
        System.out.print("Enter (x): ");

        // Read the user's input for x and store it in a variable called 'x'
        int x = kin.nextInt();

        // Prompt the user to enter the value of y
        System.out.print("Enter (y): ");

        // Read the user's input for y and store it in a variable called 'y'
        int y = kin.nextInt();

        // Check if y is zero, which is not allowed for division
        if (y == 0) {
            System.out.println("You cannot divide by zero");
            return;  // Exit the program
        }

        // Calculate the result of x divided by y and store it in a variable called 'ans'
        double ans = (double) x / y;

        // Print the result of the division
        System.out.println(x + " divided by " + y + " = " + ans);
    }
}
