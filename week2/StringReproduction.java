package week2;
import java.util.Scanner;

public class StringReproduction {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number and a string: ");

        int num = in.nextInt();
        String str = in.next();

        int i =0;
        while(i < num){
            if(i == (num-1)){
                System.out.println(str);
            }

            else{
                System.out.print(str);
            }

            i++;

        }
    }
}
