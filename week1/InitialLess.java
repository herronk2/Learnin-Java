import java.util.Scanner;

public class InitialLess {
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name: ");

        String name = in.next();
        String no_ini = name.trim().substring(1, name.length());

        System.out.format("Initialless, your name is %s.\n", no_ini);
    }
}
