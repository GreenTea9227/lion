public class Main {
    public static void main(String[] args) {
        // 수정가능지역 시작
        자동차 v = new 페라리();
        v.달리다();
        v.서다();

        페라리 f = (페라리) v;
        f.뚜껑이_열리다();
        f.달리다();
        f.서다();
        // 수정가능지역 끝
    }
}

class 자동차   {
    void 달리다() {
    }

    void 서다() {
    }
}

class 페라리 extends 자동차 {
    void 뚜껑이_열리다() {
    }
}
