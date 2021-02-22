package week2;
import java.util.Scanner;

public class Numbers {

    public static int square(int i){
        return i*i;
    }
    
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int i = in.nextInt();
        int result = Numbers.square(i);

        System.out.format("%d squared is %d", i, result);
    }
}
