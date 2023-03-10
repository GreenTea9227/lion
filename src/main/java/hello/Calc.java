package hello;

public class Calc {
    public static int run(String exp) {

        boolean needPlus = exp.contains("+");
        boolean needMinus = exp.contains("-");


        String[] split = null;
        if (needPlus) {
             split = exp.split(" \\+ ");
        } else if (needMinus) {
             split = exp.split(" \\- ");
        }

        if (split.length > 2) {
            int c = Integer.parseInt(split[2]);
        }
        int first = Integer.parseInt(split[0]);
        int second = Integer.parseInt(split[1]);
        int third =0;

        if (split.length > 2) {
             third = Integer.parseInt(split[2]);
        }

        if (needPlus) {
            return first + second + third;
        } else if (needMinus) {
            return first -  second + third;
        }


        throw new RuntimeException("해석할 수 없습니다.");
    }




}
