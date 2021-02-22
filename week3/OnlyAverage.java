package week3;
import java.util.Scanner;

public class OnlyAverage {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num  = in.nextInt();

        System.out.print("Enter " + num + " numbers: ");

        double total = 0;
        int i = 0;

        while(i != num){
            double n = in.nextDouble();
            total += n;
            i++; 
        }

        System.out.format("The average is %.1f", total/num);
    }
}
