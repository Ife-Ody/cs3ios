package aston.cs3ios.week1.lab4;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);

        // Prompt the user for the score
        System.out.print("Please enter the score: ");
        int score = kin.nextInt();

        // Determine the grade based on the score
        char grade;

        if (score >= 80) {
            grade = 'A';
        } else if (score >= 75) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 45) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Print the grade
        System.out.println("Grade: " + grade);
    }
}
