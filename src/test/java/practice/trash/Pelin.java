package practice.trash;

public class Pelin {
    public static void main(String[] args) {
        for (int i = 9999; i >= 1000; i--) {
            for (int j = 9999; j >= 1000; j--) {
                int num = i * j;
                boolean ans = check(num);
                if (ans) {
                    System.out.printf("%d -- %d -- ", i, j);
                    System.out.println(i * j);
                    return;
                }
            }
        }
    }

    private static boolean check(int num) {
        String value = String.valueOf(num);
        int start = 0;
        int end = value.length() - 1;
        ;
        while (start < end) {
//            System.out.println("start = " + value.charAt(start));
//            System.out.println("end = " + value.charAt(end));
            if (value.charAt(start++) != value.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
