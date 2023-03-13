package hello;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Calc {
    public static int run(String exp) {
        if (!exp.contains(" "))
            return Integer.parseInt(exp);

        boolean needMulti = exp.contains(" * ");
        boolean needPlus = exp.contains(" + ") || exp.contains(" - ");

        boolean needToCompound = needMulti && needPlus;

        if (needToCompound) {
            String[] split = exp.split(" \\+ ");

            String newExp = Arrays.stream(split)
                    .mapToInt(Calc::run)
                    .mapToObj(e -> e + "")
                    .collect(Collectors.joining(" + "));

            return run(newExp);
        } else if (needPlus) {
            exp = exp.replaceAll("- ", "+ -");

            String[] split = exp.split(" \\+ ");
            int ans = 0;
            for (String s : split) {
                ans += Integer.parseInt(s);
            }
            return ans;
        } else if (needMulti) {
            int ans = 1;
            String[] split = exp.split(" \\* ");

            for (String s : split) {
                ans *= Integer.parseInt(s);

            }
            return ans;
        }

        throw new RuntimeException("잘못된 식입니다");
    }
}
