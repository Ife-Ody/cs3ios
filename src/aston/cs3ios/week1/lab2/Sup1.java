package aston.cs3ios.week1.lab2;

/*
2. Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110
*/
import java.util.Scanner;

public class Sup1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner kin = new Scanner(System.in);

        // Print an introduction message to explain the program's purpose
        System.out.println("This program calculates the product of two numbers (x) and (y)");

        // Prompt the user to enter the value of x
        System.out.print("Enter (x): ");

        // Read the user's input for x and store it in a variable called 'x'
        int x = kin.nextInt();

        // Prompt the user to enter the value of y
        System.out.print("Enter (y): ");

        // Read the user's input for y and store it in a variable called 'y'
        int y = kin.nextInt();

        // Calculate the product of x and y and store it in a variable called 'ans'
        int ans = x * y;

        // Print the product of x and y
        System.out.println("The product of " + x + " and " + y + " = " + ans);
    }
}

