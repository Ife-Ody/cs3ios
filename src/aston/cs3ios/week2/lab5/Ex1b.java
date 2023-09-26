package aston.cs3ios.week2.lab5;

import java.util.Scanner;

public class Ex1b {
    public static void main(String[] args) {
        String secret = "CS3IOS";
        Scanner kin = new Scanner(System.in);
        int attempts = 0;  // Counter for attempts

        while (attempts < 3) {
            String word = kin.next();
            attempts++;  // Increment the attempts

            if (secret.equals(word)) {
                System.out.println("Bingo");
                break;  // Exit the loop when the secret word is entered
            } else {
                System.out.println("No luck");
            }
        }

        if (attempts >= 3) {
            System.out.println("Maximum attempts reached. Exiting.");
        }
    }
}
