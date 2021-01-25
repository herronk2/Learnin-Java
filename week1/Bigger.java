import java.util.Scanner;

public class Bigger {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");

        String inpt = in.next();
        String[] nums = inpt.trim().split("\\s+");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        if(num1 > num2){
            System.out.format("%d is the biggest.\n", num1);
        }
        else{
            System.out.format("%d is the biggest.\n", num2);
        }
    }    
}
