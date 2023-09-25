package aston.cs3ios.lab4;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);

        // Prompt the user for the side lengths
        System.out.print("Enter the length of side 1: ");
        int side1 = kin.nextInt();

        System.out.print("Enter the length of side 2: ");
        int side2 = kin.nextInt();

        System.out.print("Enter the length of side 3: ");
        int side3 = kin.nextInt();

        // Check if the lengths can form a triangle
        if (isTriangle(side1, side2, side3)) {
            String triangleType = getTriangleType(side1, side2, side3);
            System.out.println("Triangle type: " + triangleType);
        } else {
            System.out.println("Impossible to form a triangle with these side lengths.");
        }
    }

    // Method to check if the side lengths can form a triangle
    private static boolean isTriangle(int side1, int side2, int side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    // Method to determine the type of triangle based on side lengths
    private static String getTriangleType(int side1, int side2, int side3) {
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
