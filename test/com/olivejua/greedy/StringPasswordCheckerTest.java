package com.olivejua.greedy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringPasswordCheckerTest {
    private final StringPasswordChecker problem = new StringPasswordChecker();

    @Test
    public void test1() {
        String password = "a";

        int result = problem.strongPasswordChecker(password);

        assertThat(result).isEqualTo(5);
    }

    @Test
    public void test2() {
        String password = "aA1";

        int result = problem.strongPasswordChecker(password);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test3() {
        String password = "1337C0d3";

        int result = problem.strongPasswordChecker(password);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test4() {
        String password = "1333C0d3";

        int result = problem.strongPasswordChecker(password);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test5() {
        String password = "Baaabb0";

        int result = problem.strongPasswordChecker(password);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test6() {
        String password = "aaa123";

        int result = problem.strongPasswordChecker(password);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test7() {
        String password = "1111111111";

        int result = problem.strongPasswordChecker(password);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test8() {
        String password = "ABABABABABABABABABAB1";

        int result = problem.strongPasswordChecker(password);

        assertThat(result).isEqualTo(2);
    }
}
