import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] arg){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int num = in.nextInt();
        
        if(num%2 == 0){
            System.out.format("%d is even.\n", num);
        }
        
        else{
            System.out.format("%d is odd.\n", num);
        }
    }    
}
