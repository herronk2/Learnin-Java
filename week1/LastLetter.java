import java.util.Scanner;

public class LastLetter {
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name: ");

        String name = in.next();
        String last = name.trim().substring((name.length() - 1), name.length());
    
        System.out.format("The last letter in your name is %s\n", last);
    }
}
