package aston.cs3ios.week1.continuousAssessment;

import java.util.Scanner;

public class SampleAnswer {
    public static void main(String[] args) {
        // Display the menu with choices and numbering
        System.out.println("Menu:");
        System.out.println("1. Choice 1: Display Hello World");
        System.out.println("2. Choice 2: Display Goodbye World");
        System.out.println("3. Choice 3: Display Have a Great Day");

        // Read the user's choice from the console
        System.out.print("Enter your choice (1-3): ");
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        // Output a predefined message based on the user's choice using if-else
        if (choice == 1) {
            System.out.println("You chose: Choice 1 - Hello World");
        } else if (choice == 2) {
            System.out.println("You chose: Choice 2 - Goodbye World");
        } else if (choice == 3) {
            System.out.println("You chose: Choice 3 - Have a Great Day");
        } else {
            System.out.println("Invalid choice. Please select a number between 1 and 3.");
        }
    }
}

