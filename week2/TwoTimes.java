package week2;
import java.util.Scanner;

public class TwoTimes {
    
    static int Helper(int i){
        return i * 2;
    }
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int i = in.nextInt();
        int new_i = TwoTimes.Helper(i);

        System.out.println(new_i);
    }
}
