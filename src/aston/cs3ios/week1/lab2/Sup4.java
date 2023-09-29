package aston.cs3ios.week1.lab2;

import java.util.Arrays;
import java.util.Scanner;

/*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
public class Sup4 {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);
        System.out.println("This program calculates the average of a set of numbers");
        System.out.print("Enter the set of numbers (separated by a space): ");
        // Read the input line and split it into an array of strings
        String[] inputNumbers = kin.nextLine().split(" ");

        // Create an array to hold the integers
        int[] numbers = new int[inputNumbers.length];

        // Convert the strings to integers and store them in the array
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        // Calculate the mean
        double mean = calculateMean(numbers);

        // Calculate the mode
        int mode = calculateMode(numbers);

        // Calculate the median
        double median = calculateMedian(numbers);

        // Calculate the inter quartile range (IQR)
        double iqr = calculateInterquartileRange(numbers);

        // Calculate the standard deviation
        double standardDeviation = calculateStandardDeviation(numbers);

        // Print the results
        System.out.println("Mean: " + mean);
        System.out.println("Mode: " + mode);
        System.out.println("Median: " + median);
        System.out.println("Interquartile Range (IQR): " + iqr);
        System.out.println("Standard Deviation: " + standardDeviation);

    }

    private static double calculateMean(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    private static int calculateMode(int[] numbers) {
        // Count the occurrences of each number
        int maxCount = 0;
        int mode = -1;

        for (int num : numbers) {
            int count = 0;
            for (int n : numbers) {
                if (n == num) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = num;
            }
        }

        return mode;
    }

    private static double calculateMedian(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        if (length % 2 == 0) {
            return (double) (numbers[length / 2 - 1] + numbers[length / 2]) / 2;
        } else {
            return numbers[length / 2];
        }
    }

    private static double calculateInterquartileRange(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        double q1 = calculateMedian(Arrays.copyOfRange(numbers, 0, length / 2));
        double q3 = calculateMedian(Arrays.copyOfRange(numbers, (length + 1) / 2, length));
        return q3 - q1;
    }

    private static double calculateStandardDeviation(int[] numbers) {
        double mean = calculateMean(numbers);
        double sumOfSquares = 0;
        for (int num : numbers) {
            sumOfSquares += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumOfSquares / numbers.length);
    }
}
