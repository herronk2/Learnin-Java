package week2;

public class OneToTen {
    public static void main(String[] arg){
        String count = " \n";

        //  loop part
        for(int i = 1; i<= 10; i++){
            count += (i + " ");
        }

        //  output
        System.out.print(count);
    }
}
