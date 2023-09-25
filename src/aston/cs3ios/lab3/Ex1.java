package aston.cs3ios.lab3;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner kin = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int x =  kin.nextInt();
        System.out.print("Please enter second number: ");
        int y =  kin.nextInt();

        double result = Math.pow(x, y);
        System.out.println((int)result);
    }
}
