package practice.p120906;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    @DisplayName("1234 => 10")
    void t1() {
        Assertions.assertThat(new Solution().solution(1234)).isEqualTo(10);
    }

    @Test
    @DisplayName("930211 => 16")
    void t2() {
        Assertions.assertThat(new Solution().solution(930211)).isEqualTo(16);
    }

    @Test
    @DisplayName("123 => 6")
    void t3() {
        Assertions.assertThat(new Solution().solution(123)).isEqualTo(6);
    }

    @Test
    @DisplayName("987 => 24")
    void t4() {
        Assertions.assertThat(new Solution().solution(987)).isEqualTo(24);
    }
}
