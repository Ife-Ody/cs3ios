package aston.cs3ios.week1.lab1;
/*
1. Write a Java program to print 'Hello' on screen and your name on a separate line.
        Expected Output :
        Hello
        Alexandra Abramov
*/
import java.util.Scanner;

public class Sup1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner kin = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's input and store it in a variable called 'name'
        String name = kin.nextLine();

        // Print a greeting message using the provided name
        System.out.println("Hello " + name);
    }
}
