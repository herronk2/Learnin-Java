package week2;
import java.util.Scanner;

public class Measure {
    public static double Inches2CMs(double inch){
        return inch * 2.54;
    }

    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        double inch = in.nextDouble();
        double result = Measure.Inches2CMs(inch);

        System.out.format("%.2f inches is %.2f CMs.\n", inch, result);
    }
}
