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

        int first = Integer.parseInt(split[0]);
        int second = Integer.parseInt(split[1]);
        if (needPlus) {
            return first + second;
        } else if (needMinus) {
            return first -  second;
        }


        throw new RuntimeException("해석할 수 없습니다.");
    }




}
