package week2;
import java.util.Scanner;

public class NumToTwenty {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = in.nextInt();
        String count = "";

        for(int i=num; i<= 20; i++){
            count += (i + " ");   
        }
        System.out.println(count);
    }
}
