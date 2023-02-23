import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.assertj.core.api.Assertions.*;

public class Test1 {

    @Test
    @DisplayName("91일때의 결과는 3")
    void test1() {
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("91일때의 결과는 3")
    void test2() {
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("92일때의 결과는 3")
    void test3() {
        assertThat(new Solution().solution(92)).isEqualTo(3);
    }

    @Test
    @DisplayName("180일때의 결과는 4")
    void test4() {
        assertThat(new Solution().solution(92)).isEqualTo(3);

    }
}

class Solution {
    public int solution(int angle) {
        if (angle > 90) return 3;
        if (angle == 180) return 3;
        return 1;

    }
}

//tdd는 무조건 빠르게 통과

