package aston.cs3ios.week2.lab5;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = kin.nextInt();

        if (n < 1) {
            System.out.println("Error: Negative number");
        } else {
            int countFactors = 0;

            for (int k = 2; k < n; k++) {
                if (n % k == 0) {
                    countFactors++;
                }
            }

            System.out.println("Number of factors larger than 1: " + countFactors);
        }
    }
}
