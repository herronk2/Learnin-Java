import java.util.Scanner;

public class ReducedString {
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer and a string: ");

        int pos = in.nextInt();
        String word = in.next();

        String new_word = word.trim().substring(pos, pos+1);
        System.out.print(new_word);
    }
}
