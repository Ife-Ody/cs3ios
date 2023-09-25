package aston.cs3ios.lab2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("What is your age please? ");

        // Read the age as an integer
        int currentAge = kin.nextInt();

        // Calculate the age for next year
        int nextYearAge = currentAge + 1;

        // Print the result
        System.out.printf("Next year you will be %d years old%n", nextYearAge);

    }
}
