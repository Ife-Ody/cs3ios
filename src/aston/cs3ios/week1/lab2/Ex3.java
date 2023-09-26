package aston.cs3ios.week1.lab2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the width of the rectangle
        System.out.print("Please enter the width: ");
        int width = scanner.nextInt();

        // Prompt the user for the height of the rectangle
        System.out.print("Please enter the height: ");
        int height = scanner.nextInt();

        // Calculate the area of the rectangle
        int area = width * height;

        // Print the result
        System.out.printf("The area is %d*%d=%d%n", width, height, area);
    }
}
