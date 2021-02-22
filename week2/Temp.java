package week2;
import java.util.Scanner;

public class Temp {
    public static double fahr2cels(double fahr){        
        //  formula: (0°C × 9/5) + 32 = 32°F
        return (fahr * 1.8) + 32;
    }

    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Give me a Fahrenheit temperature: ");

        double fahr = in.nextDouble();
        double cels = Temp.fahr2cels(fahr);

        System.out.format("In celsius that would be: %.2f\n", cels);
    }
}
