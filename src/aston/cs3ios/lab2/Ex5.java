package aston.cs3ios.lab2;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner kin = new Scanner(System.in);

        // Prompt the user for the number of seconds
        System.out.print("Please enter the number of seconds: ");
        int totalSeconds = kin.nextInt();

        // Calculate minutes and remaining seconds
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        // Print the result
        System.out.printf("%d second(s) = %d minute(s) %d second(s)%n", totalSeconds, minutes, remainingSeconds);
    }
}
