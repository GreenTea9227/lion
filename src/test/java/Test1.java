import java.util.Arrays;

public class Test1 {
    public static final int MYNUM = 23;

    public static void main(String[] args) {

        boolean[] dp = new boolean[MYNUM + 1];
        Arrays.fill(dp, true);
        dp[0] = false;
        dp[1] = false;
        for (int i = 2; i < MYNUM; i++) {
            if (dp[i]) {
                for (int j = i * 2; j < MYNUM; j += i) {
                    dp[j] = false;
                }
            }
        }

        int ans = 1;
        for (int i = 2; i < MYNUM; i++) {
            if (dp[i]) {
                int n =1;
                while (true) {
                    int next = (int)Math.pow(i,n+1);
                    if (next > MYNUM) {
                        ans = ans * (int)Math.pow(i,n);
//                        System.out.printf("%d번째 최대 값 %d\n",i,(int)Math.pow(i,n));
                        break;
                    }
                    n++;
                }
            }
        }
        System.out.println(ans);

    }


}
