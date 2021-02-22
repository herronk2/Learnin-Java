package week3;

public class Test {
    static int getSum(int[] arr){

        int total = 0;
        for(int i=0; i < arr.length; i++){
            total += arr[i];
        }

        return total;
 
    }

    static int countEven(int[] arr){
        int count = 0;

        for(int i=0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count += 1;
            }
        }

        return count;
    }
}