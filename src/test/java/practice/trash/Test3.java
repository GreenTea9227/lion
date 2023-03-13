package practice.trash;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        long num = 1600851475143L;
        int len = (int) (Math.sqrt(num));

        boolean[] arr = new boolean[len+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;

        for (int i = 2; i <= len ; i++) {
            if (!arr[i]) {
                continue;
            }

            for (int j = i*2; j <= len; j+=i) {
                arr[j]=false;
            }
        }


        for (int i = (int) Math.sqrt(num); i > 0; i--) {
            if (arr[i] && num%i==0) {
                System.out.println(i);
                break;
            }
        }



    }
}
