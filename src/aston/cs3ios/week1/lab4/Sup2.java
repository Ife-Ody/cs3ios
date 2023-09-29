package aston.cs3ios.week1.lab4;

import java.util.Scanner;

/*
* 18. Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110
* */
public class Sup2 {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        String binary1 = kin.nextLine();

        System.out.print("Input the second binary number: ");
        String binary2 = kin.nextLine();

        // Convert binary numbers to decimal
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Multiply decimal numbers
        int productDecimal = decimal1 * decimal2;

        // Convert the product back to binary
        String productBinary = Integer.toBinaryString(productDecimal);

        System.out.println("Product of two binary numbers: " + productBinary);

        kin.close();
    }
}
