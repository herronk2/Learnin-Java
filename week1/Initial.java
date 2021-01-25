import java.util.Scanner;

public class Initial {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name: ");

        //  get name and initial
        String name = in.nextLine();;
        String initial = name.substring(0, 1);

        System.out.format("%s starts with the letter %s", name, initial);
    }
}
