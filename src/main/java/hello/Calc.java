package hello;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Calc {
    public static int run(String exp) {
        exp =exp.trim();
        exp = stripOuterBrackets(exp);

        if (!exp.contains(" "))
            return Integer.parseInt(exp);

        boolean needMulti = exp.contains(" * ");
        boolean needPlus = exp.contains(" + ") || exp.contains(" - ");
        boolean needToCompound = needMulti && needPlus;
        boolean needToSplit = exp.contains(("(")) || exp.contains((")"));

        if (needToSplit) {
            int bracketsCount = 0;
            int splitPointIndex = -1;

            for (int i = 0; i < exp.length(); i++) {
                if (exp.charAt(i) == '(') {
                    bracketsCount++;

                } else if (exp.charAt(i) == ')') {
                    bracketsCount--;
                }

                if (bracketsCount == 0) {
                    splitPointIndex= i;
                    break;
                }

            }
            String firstExp = exp.substring(0,splitPointIndex+1);
            String secondExp = exp.substring(splitPointIndex+4);
            return run(firstExp) + run(secondExp);
        }

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

    private static String stripOuterBrackets(String exp) {

        while (exp.charAt(0) == '(' && exp.charAt(exp.length() - 1) == ')') {
            exp = exp.substring(1, exp.length() - 1);
        }

        return exp;
    }
}
