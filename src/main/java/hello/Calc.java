package hello;

public class Calc {
    public static int run(String exp) {

        boolean needPlus = exp.contains("+");
        boolean needMinus = exp.contains("-");

        exp = exp.replaceAll("- ", "+ -");

        String[] split = exp.split(" \\+ ");

        int ans = 0;
        for (String s : split) {
            ans += Integer.parseInt(s);
        }

        return ans;
    }
}
