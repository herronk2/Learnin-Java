package week2;
import java.util.Scanner;

public class OneToNum {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        String count = "\n";

        for(int i=1; i<=num; i++){
            count += (i + " ");
        }

        System.out.println(count);
    }
}
