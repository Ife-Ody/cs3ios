package aston.cs3ios.week1.lab2;

import java.util.Scanner;

/*
 * 11. Write a Java program to print the area and perimeter of a circle.
 * Test Data:
 * Radius = 7.5
 * Expected Output:
 * Perimeter is = 47.12388980384689
 * Area is = 176.71458676442586
 */
public class Sup3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner kin = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle:");

        // Read the user's input for the radius and store it in a variable called 'radius'
        int radius = kin.nextInt();

        // Calculate the area of the circle using the formula: π * radius^2
        double area = (double) radius * radius * Math.PI;

        // Calculate the perimeter of the circle using the formula: 2 * π * radius
        double perimeter = 2 * radius * Math.PI;

        // Print the calculated area and perimeter of the circle
        System.out.println("The area of the circle is = " + area);
        System.out.println("The perimeter of the circle is = " + perimeter);
    }
}
