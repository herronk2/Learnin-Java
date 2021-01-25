import java.util.Scanner;

public class two_Times{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        
        //  ask user for input
        System.out.print("Enter a number: ");

        int i = in.nextInt();
        i = (i*2);

        System.out.print("Times two is: ");
        System.out.println(i);
    }
}
