import java.util.Random;

public class test {

    public static void main(String[] args) {
        System.out.println("1부터 5까지 출력해주세요");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("1부터 5까지의 합을 출력해주세요");
        int i=1;
        int sum=0;
        while (i <= 5) {
           sum += i;
           i++;
        }
        System.out.println(sum);
        System.out.println("문제 - -100부터 25까지의 합을 출력해주세요.");
        sum=0;
        for (int j = -100; j <= 25; j++) {
              sum+=j;
        }
        System.out.println("sum = " + sum);

        System.out.println("문제 - 1부터 3까지 출력하는 작업을 10번 해주세요. 2중 while문 사용");
        int first=0;
        while (first <10) {
            int second=1;
            while (second <=3) {
                System.out.print(second++ +" ");
            }
            first++;
            System.out.println();
        }
    }

}


