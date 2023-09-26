package aston.cs3ios.week1.lab3;
import java.util.Scanner;
public class Ex2b {
    public static void main(String []args){
        Scanner kin = new Scanner(System.in);

        System.out.print("Please enter a floating-point number: ");
        double input = kin.nextDouble();
        // Format the input to 3 decimal places using String.format
        String formattedInput = String.format("%.3f", input);

        System.out.println("Your input is " + formattedInput);
    }
}