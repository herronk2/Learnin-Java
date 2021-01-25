import java.util.Scanner;

public class DoubleDivision {

    public static void main(String[] arg){
        System.out.print("Please enter two floating point numbers: ");
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        String[] strs = line.trim().split("\\s+");

        double outpt = Double.parseDouble(strs[0]) / Double.parseDouble(strs[1]);

        System.out.format("%s / %s is %.1f", Float.parseFloat(strs[0]),  Float.parseFloat(strs[1]), outpt);
    }
}
