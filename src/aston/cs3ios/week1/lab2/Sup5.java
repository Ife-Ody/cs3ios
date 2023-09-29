package aston.cs3ios.week1.lab2;

import java.util.Scanner;

/*
 * 33. Write a Java program and compute the sum of an integer's digits.
 * Input Data:
 * Input an integer: 25
 * Expected Output:
 * The sum of the digits is: 7
 */
public class Sup5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner kin = new Scanner(System.in);

        // Print a message asking the user to enter an integer
        System.out.println("Enter an integer:");

        // Read the user's input (integer) and store it in a variable called 'x'
        int x = kin.nextInt();

        // Variable to store the sum of digits
        int ans = 0;

        // Loop to calculate the sum of digits
        while (x >= 1) {
            // Add the last digit of x to the sum
            ans += x % 10;

            // Remove the last digit from x
            x /= 10;
        }

        // Print the sum of digits
        System.out.println("The sum of the digits is: " + ans);
    }
}
