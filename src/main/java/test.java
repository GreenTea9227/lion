import java.util.Random;

public class test {

    public static void main(String[] args) {
        System.out.println("v1=========");
        int dan = 8;
        System.out.println("8 * 1 = 8");
        System.out.println("8 * 2 = 16");
        System.out.println("8 * 3 = 24");
        System.out.println("8 * 4 = 32");
        System.out.println("8 * 5 = 40");
        System.out.println("8 * 6 = 48");
        System.out.println("8 * 7 = 56");
        System.out.println("8 * 8 = 64");
        System.out.println("8 * 9 = 72");

        System.out.println("v2=========");
        System.out.println(dan+"* 1 = 8");
        System.out.println(dan+"* 2 = 16");
        System.out.println(dan+"* 3 = 24");
        System.out.println(dan+"* 4 = 32");
        System.out.println(dan+"* 5 = 40");
        System.out.println(dan+"* 6 = 48");
        System.out.println(dan+"* 7 = 56");
        System.out.println(dan+"* 8 = 64");
        System.out.println(dan+"* 9 = 72");

        System.out.println("v3=========");
        int dan2=2;

        System.out.println(dan2+"* 1 = "+dan2*1);
        System.out.println(dan2+"* 2 = "+dan2*2);
        System.out.println(dan2+"* 3 = "+dan2*3);
        System.out.println(dan2+"* 4 = "+dan2*4);
        System.out.println(dan2+"* 5 = "+dan2*5);
        System.out.println(dan2+"* 6 = "+dan2*6);
        System.out.println(dan2+"* 7 = "+dan2*7);
        System.out.println(dan2+"* 8 = "+dan2*8);
        System.out.println(dan2+"* 9 = "+dan2*9);

        // 수정가능지역 시작
        int i = 1;
        System.out.println("v4=========");
        System.out.println(dan + " * " + i + " = " + dan * i++);
        System.out.println(dan + " * 2 = " + dan * i++);
        System.out.println(dan + " * 3 = " + dan * i++);
        System.out.println(dan + " * 4 = " + dan * i++);
        System.out.println(dan + " * 5 = " + dan * i++);
        System.out.println(dan + " * 6 = " + dan * i++);
        System.out.println(dan + " * 7 = " + dan * i++);
        System.out.println(dan + " * 8 = " + dan * i++);
        System.out.println(dan + " * 9 = " + dan * i++);
        // 수정가능지역 끝

    }
}


