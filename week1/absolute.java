import java.util.Scanner;
import java.lang.Math;

public class absolute {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = in.nextInt();
        num = Math.abs(num);
        
        System.out.format("The absolute value is %d\n", num);
    }
}
