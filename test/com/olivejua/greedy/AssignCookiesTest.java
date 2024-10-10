package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssignCookiesTest {

    private AssignCookies problem = new AssignCookies();

    @Test
    public void test1() {
        int[] g = {1,2};
        int[] s = {1,2,3};

        int result = problem.findContentChildren(g, s);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[] g = {1,2,3};
        int[] s = {1,1};

        int result = problem.findContentChildren(g, s);

        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void test3() {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};

        int result = problem.findContentChildren(g, s);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test4() {
        int[] g = {1,2,3};
        int[] s = {3};

        int result = problem.findContentChildren(g, s);

        Assertions.assertThat(result).isEqualTo(1);
    }
}
