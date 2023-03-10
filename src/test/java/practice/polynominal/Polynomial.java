package practice.polynominal;

import java.util.Stack;

public class Polynomial {

    String str;
    String[] strings;

    public Polynomial(String s) {
        strings = s.split(" ");
    }

    public int calc() {

        Stack<String> stack = new Stack<>();

        for (String string : strings) {
            stack.push(string);
        }
        while (!stack.isEmpty()) {

        }

        return 0;
    }
}
