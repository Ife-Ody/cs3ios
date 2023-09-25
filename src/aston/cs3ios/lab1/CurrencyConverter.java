package aston.cs3ios.lab1;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        // Exchange rate from GBP to USD
        float exchangeRate = 1.37F;

        // Prompt the user for the amount in GBP
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in GBP: ");

        // Read the input as a floating-point number
        double gbpAmount = scanner.nextDouble();

        // Convert GBP to USD
        double usdAmount = gbpAmount * exchangeRate;

        // Print the amount in USD
        System.out.printf("Amount in USD: %.2f%n", usdAmount);
    }
}


