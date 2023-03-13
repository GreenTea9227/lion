package hello;

public class Calc {
    public static int run(String exp) {

        boolean needMulti = exp.contains("*");
        boolean needPlus = exp.contains("+");

        boolean needToCompound = needMulti && needPlus;

        if (needToCompound) {
            String[] split = exp.split(" \\+ ");


            return run(split[1]) + Integer.parseInt(split[0]);
        }


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
