package aston.cs3ios.week1.lab3;
import java.text.DecimalFormat;
        import java.util.Scanner;
public class Ex2 {
    public static void main(String []args){
        String formatString="#.#";
        Scanner kin = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat(formatString);
        double input=kin.nextDouble();
        String result=df.format(input);
        System.out.println("Your input is "+ result);
    }
}