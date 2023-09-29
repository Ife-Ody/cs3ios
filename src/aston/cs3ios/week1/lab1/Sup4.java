package aston.cs3ios.week1.lab1;

import java.util.Scanner;

/* 15. Write a Java program to swap two variables. */
public class Sup4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner kin = new Scanner(System.in);

        // Print an introduction message to explain the program's purpose
        System.out.println("This program swaps two variables (x) and (y)");

        // Prompt the user to enter the value of x
        System.out.print("Enter (x): ");

        // Read the user's input for x and store it in a variable called 'x'
        int x = kin.nextInt();

        // Prompt the user to enter the value of y
        System.out.print("Enter (y): ");

        // Read the user's input for y and store it in a variable called 'y'
        int y = kin.nextInt();

        // Temporary variable to hold the value of x for swapping
        int buffer;

        // Swap the values of x and y using the temporary variable
        buffer = x;
        x = y;
        y = buffer;

        // Print the swapped values of x and y
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
