package practice;

import java.util.Arrays;

public class Test2 {

    public static final int NUM = 50000000;
    public static void main(String[] args) {

        int[] dp = new int[NUM+1];
        dp[0] =0;
        dp[1]=1;
        for (int i = 2; i <= NUM; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        long ans=0;
        for (int i = 0; i <= NUM; i++) {
            if (dp[i]%2==0) {
                ans+=dp[i];
            }
        }

        System.out.println(ans);
    }
}
