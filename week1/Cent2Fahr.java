import java.util.Scanner;

public class Cent2Fahr {
    public static void main(String[] arg){
        System.out.print("Enter temperature in centigrade: ");
        Scanner in = new Scanner(System.in);
        
        //  formula: (0°C × 9/5) + 32 = 32°F
        int cent = in.nextInt();
        double cent_to_fahr = (cent * 1.8) + 32;

        System.out.format("%d centigrade is %.1f", cent, cent_to_fahr);
    }
}
