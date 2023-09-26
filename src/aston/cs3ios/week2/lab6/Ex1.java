package aston.cs3ios.week2.lab6;

import java.util.Scanner;

/*Write a program which reads two integers, x and y, from user and print out x '*' and
y '–' to the screen. */
public class Ex1 {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);

        System.out.print("Enter the number of (x):");
        int x = kin.nextInt();
        System.out.print("Enter the number of (y):");
        int y = kin.nextInt();
        // Print '*' x times
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }

        // Print '-' y times
        for (int i = 0; i < y; i++) {
            System.out.print("-");
        }

        // Print a new line at the end
        System.out.println();
    }
}
