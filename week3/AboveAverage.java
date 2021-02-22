package week3;
import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num = in.nextInt();

        double arr[] = new double[num];

        double total = 0.0;
        System.out.print("Enter " + num + " numbers: ");

        for(int i=0; i<num; i++){
            double inp = in.nextDouble();
            arr[i] = inp;
            total += inp;
        }

        System.out.println("The above average numbers are: ");
        for(int i=0; i < num; i++){
            if(arr[i] > total/num){
                System.out.print(" " + arr[i]);
            }
        }

        System.out.println();
    }
}
