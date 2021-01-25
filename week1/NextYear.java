import java.util.Scanner;

public class NextYear {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        //  get name and age
        String inpt = in.nextLine();
        String[] strs = inpt.trim().split("\\s+");
        
        String name = strs[0];
        String curr_age = strs[1];

        //  ask for name
        System.out.format("What is your name: %s\n", name);

        //  get next age
        System.out.format("What age are you: %s\n", curr_age);
        int next_age = (Integer.parseInt(strs[1])) + 1; 

        //  output
        System.out.format("Hello %s, next year you will be %d.\n", name, next_age); 
    }
}
