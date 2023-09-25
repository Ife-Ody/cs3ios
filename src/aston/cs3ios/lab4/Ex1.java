package aston.cs3ios.lab4;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);

        // Prompt the user for their name and age
        System.out.print("Please enter your name: ");
        String name = kin.nextLine();

        System.out.print("Please enter your age: ");
        int age = kin.nextInt();

        // Check if the person is eligible for the holiday (age between 18 and 35)
        if (age >= 18 && age < 35) {
            System.out.println("Welcome to the holiday, " + name + "!");
        } else {
            System.out.println("Sorry " + name + ", we only service people under 35.");
        }
    }
}
