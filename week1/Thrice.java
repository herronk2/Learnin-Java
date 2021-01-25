import java.util.Scanner;

public class Thrice {
    public static void main(String[] arg){
        System.out.print("Enter three numbers: ");
        
        Scanner in = new Scanner(System.in);
        
        //  input string, split into array
        String line = in.nextLine();
        String[] strs = line.trim().split("\\s+");

        //  convert to ints and make calculation
        int total = Integer.parseInt(strs[0]) * Integer.parseInt(strs[1]) * Integer.parseInt(strs[2]);

        System.out.format("The product is: %d ", total);
    }

}
