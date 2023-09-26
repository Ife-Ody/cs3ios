package aston.cs3ios.week2.lab6;
/*
Write a program which accept an integer s and print the following pattern in s x s
block. The diagram shown below is the pattern printed in 6x6 block
******
*----*
*----*
*----*
*----*
******
*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);
        int s = kin.nextInt();
        // if s<2 return an error and end the program
        if (s < 2) {
            System.out.println("Error: Please enter a number greater than 1");
            return;
        }

        int size = s - 2; // work out the dimensions for the smaller --- square
        // print out the first line *****...s
        for (int i = 0; i < s; i++) {
            System.out.print("*");
        }

        // print out the middle square of dashes (*----*)
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("*"); //print first * on the line
            //loop through and print the ----
            for (int j = 0; j < size; j++) {
                System.out.print("-");
            }
            System.out.print("*"); //print second * at the end of the line

            System.out.println(); // move to a new line
        }

        // print out the final line *****...s
        for (int i = 0; i < s; i++) {
            System.out.print("*");
        }
    }
}
