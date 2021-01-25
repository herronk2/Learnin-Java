import java.util.Scanner;

public class SquareIt {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int i = in.nextInt();
        int squared = i*i;

        System.out.format("%d squared is: ", squared);
        System.out.println(squared);
    }
}
