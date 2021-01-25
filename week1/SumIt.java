import java.util.Scanner;

public class SumIt {
    public static void main(String[] arg){
        System.out.print("Enter two numbers: ");
        //  get input
        Scanner in = new Scanner(System.in);

        int total =0;

        //  read ints in as string, split into array
        String line = in.nextLine();
        String[] strs = line.trim().split("\\s+");

        //   convert to ints and add to total
        for(int i=0; i<strs.length; i++){
            total = total + Integer.parseInt(strs[i]);
        }
        System.out.format("%s and %s is %d\n", strs[0], strs[1], total); 
    }
}
