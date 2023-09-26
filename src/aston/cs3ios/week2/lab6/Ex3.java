package aston.cs3ios.week2.lab6;

import java.util.Scanner;

/*
 * Use nested for-loop to generate m (row) x n (col) Times Table,
 * where m and n are two integers inputted by user.
 * You may assume that the first input is m and the second input is n.
 * Each output takes up 5 characters space in width.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);

        // Prompt the user to enter the number of rows (m)
        System.out.print("Enter m (row):");
        int m = kin.nextInt();

        // Prompt the user to enter the number of columns (n)
        System.out.print("Enter n (col):");
        int n = kin.nextInt();

        // Outer loop for rows (m)
        for (int i = 1; i < m + 1; i++) {

            // Inner loop for columns (n)
            for (int j = 1; j < n + 1; j++) {
                // Calculate the product of i and j
                int product = i * j;

                // Calculate the length of the product (number of digits)
                int length = String.valueOf(product).length();

                // Calculate the number of spaces needed to make the output take up 5 characters width
                int spaces = 5 - length;

                // Print the product of i and j
                System.out.print(product);

                // Print the necessary spaces to ensure the output takes up 5 characters width
                for (int k = 0; k < spaces; k++) {
                    System.out.print(" ");
                }
            }

            // Move to the next line after printing a row of products
            System.out.println();
        }
    }
}
