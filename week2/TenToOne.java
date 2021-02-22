package week2;

public class TenToOne {
    public static void main(String[] arg){
        String count = "";

        for(int i=10; i>=1; i--){
            count += (" " + i);
        }
        System.out.println(count);
    }
}
