package com.olivejua;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HappyNumberTest {
    private final HappyNumber problem = new HappyNumber();

    @Test
    public void test1() {
        int n = 19;

        boolean result = problem.isHappy2(n);

        assertThat(result).isEqualTo(true);
    }

    @Test
    public void test2() {
        int n = 2;

        boolean result = problem.isHappy2(n);

        assertThat(result).isEqualTo(false);
    }
}