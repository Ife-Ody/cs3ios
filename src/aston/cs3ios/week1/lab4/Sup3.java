package aston.cs3ios.week1.lab4;

import java.util.Scanner;

public class Sup3 {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);

        System.out.print("Input an octal number: ");
        String octalInput = kin.nextLine();

        // Convert octal to decimal
        int decimalNumber = Integer.parseInt(octalInput, 8);

        // Convert decimal to hexadecimal
        String hexadecimalOutput = Integer.toHexString(decimalNumber).toUpperCase();

        System.out.println("Equivalent hexadecimal number: " + hexadecimalOutput);

        kin.close();
    }
}
