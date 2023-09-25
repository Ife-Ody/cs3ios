package aston.cs3ios.lab1;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("What is your name:");
        Scanner kin = new Scanner(System.in);
        System.out.println("Hello " +
                kin.nextLine());
    }
}
