package aston.cs3ios.week2.lab5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String secret = "CS3IOS";
        Scanner kin = new Scanner(System.in);

        while (true) {
            String word = kin.next();
            if (secret.equals(word)) {
                System.out.println("Bingo");
                break;  // Exit the loop when the secret word is entered
            } else {
                System.out.println("No luck");
            }
        }
    }
}


