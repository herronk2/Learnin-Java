import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        String name = in.nextLine().trim();
        int name_len = name.length();

        System.out.format("Enter your name: Hello %s, your name has %d letters.\n", name, name_len);
    }
}
