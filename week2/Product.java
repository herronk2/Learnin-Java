package week2;
import java.util.Scanner;

public class Product {
    public static int multiply(int i, int mult){
        //  multiply i times mult
        return i*mult;
    }

    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int result = Product.multiply(a, b);

        System.out.format("%d times %d is %d\n", a, b, result);
    }

}
