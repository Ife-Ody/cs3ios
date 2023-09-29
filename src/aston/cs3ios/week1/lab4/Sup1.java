package aston.cs3ios.week1.lab4;

import java.util.Scanner;

/*
 * 6. Write a Java program to print the sum (addition), multiply, subtract,
 * divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output:
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Sup1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner kin = new Scanner(System.in);

        // Print an introduction message to explain the program's purpose
        System.out.println("This program performs some operations on two numbers (x) and (y)");

        // Prompt the user to enter the value of x
        System.out.print("Enter (x): ");

        // Read the user's input for x and store it in a variable called 'x'
        int x = kin.nextInt();

        // Prompt the user to enter the value of y
        System.out.print("Enter (y): ");

        // Read the user's input for y and store it in a variable called 'y'
        int y = kin.nextInt();

        // Calculate the sum, subtraction, product, division, and remainder
        int add = x + y;
        int sub = x - y;
        int prod = x * y;
        String div;
        String mod;

        // Check if y is zero to prevent division by zero
        if (y == 0) {
            div = "Can't divide by Zero";
            mod = "Can't divide by Zero";
        } else {
            div = String.valueOf(x / y);
            mod = String.valueOf(x % y);
        }

        // Print the results for sum, subtraction, product, division, and remainder
        System.out.println(x + " + " + y + " = " + add);
        System.out.println(x + " - " + y + " = " + sub);
        System.out.println(x + " * " + y + " = " + prod);
        System.out.println(x + " / " + y + " = " + div);
        System.out.println(x + " mod " + y + " = " + mod);
    }
}
