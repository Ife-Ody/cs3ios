package aston.cs3ios.week1.lab4;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Check the age group and determine the admission price
        int admissionPrice;

        // Check that the age is valid... not part of the task but i think it's necessary... could also do try-catch
        while (age < 0 ){
            System.out.println("ERROR: Invalid Age");
            System.out.print("Please enter your age: ");
            age = scanner.nextInt();
        }

        if (age < 4 || age >= 70) {
            admissionPrice = 0;
            System.out.println("Admission Price: £" + admissionPrice + " (Free)");
        } else if (age <= 17) {
            admissionPrice = 5;
            System.out.println("Admission Price: £" + admissionPrice);
        } else {
            admissionPrice = 10;
            System.out.println("Admission Price: £" + admissionPrice);
        }
    }
}
