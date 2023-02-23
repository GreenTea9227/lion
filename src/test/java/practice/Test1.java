import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.assertj.core.api.Assertions.*;

public class Test1 {

    @Test
    @DisplayName("n이 2일때 결과 값은 2")
    void test1() {
       assertThat(new Solution().solution(2)).isEqualTo(2);
    }

    @Test
    @DisplayName("n이 3일때 결과 값은 2")
    void test2() {
        assertThat(new Solution().solution(3)).isEqualTo(2);
    }

    @Test
    @DisplayName("n이 4일때 결과 값은 2")
    void test3() {
        assertThat(new Solution().solution(4)).isEqualTo(6);
    }


}

class Solution {
    public int solution(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                sum+=i;
            }
        }
        return sum;
    }
}

//tdd는 무조건 빠르게 통과

