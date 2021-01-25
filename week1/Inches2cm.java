import java.util.Scanner;

public class Inches2cm {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter quantity in inches: ");
        int inch = in.nextInt();

        //  1 inch is 2.54 cm. Conversion here.
        double inch_in_cm = inch * 2.54;

        System.out.format("%d inch is %.2f cm\n", inch, inch_in_cm);
    }
}
