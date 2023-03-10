package hello;

public class Calc {
    public static int run(String exp) {

        boolean needMulti = exp.contains("*");
        boolean needPlus = !needMulti;
        int ans = 0;

        if (needPlus) {
            exp = exp.replaceAll("- ", "+ -");

            String[] split = exp.split(" \\+ ");

            for (String s : split) {
                ans += Integer.parseInt(s);
            }
        } else {
            ans = 1;
            String[] split = exp.split(" \\* ");

            for (String s : split) {
                ans *= Integer.parseInt(s);
            }

        }

        return ans;
    }
}
