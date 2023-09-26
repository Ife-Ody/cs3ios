package aston.cs3ios.week1.lab2;

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner kin = new Scanner(System.in);

        // Prompt the user for the number of seconds
        System.out.print("Please enter the number of seconds: ");
        int totalSeconds = kin.nextInt();

        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int remainingSecondsAfterHours = totalSeconds % 3600;
        int minutes = remainingSecondsAfterHours / 60;
        int remainingSeconds = remainingSecondsAfterHours % 60;

        // Print the result
        System.out.printf("%d second(s) = %d hour(s) %d minute(s) %d second(s)%n",
                totalSeconds, hours, minutes, remainingSeconds);
    }
}