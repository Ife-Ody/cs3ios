package aston.cs3ios.lab3;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble() / 100.0;  // Convert percentage to decimal

        System.out.print("Enter number of compounding periods (years): ");
        int numCompoundingPeriods = scanner.nextInt();

        // Calculate compound interest
        double compoundInterest = principal * (Math.pow(1 + annualInterestRate, numCompoundingPeriods) - 1);

        // Format the compound interest to 2 decimal places with grouping separator
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        decimalFormat.applyPattern("#,##0.00");
        String formattedInterest = decimalFormat.format(compoundInterest);

        // Print the result
        System.out.println("Interest: " + formattedInterest);
    }
}
