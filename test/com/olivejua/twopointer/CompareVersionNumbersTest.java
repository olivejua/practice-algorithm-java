package com.olivejua.twopointer;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareVersionNumbersTest {
    private final CompareVersionNumbers problem = new CompareVersionNumbers();

    @Test
    public void test1() {
        String version1 = "1.2";
        String version2 = "1.10";

        int result = problem.compareVersion(version1, version2);

        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test2() {
        String version1 = "1.01";
        String version2 = "1.001";

        int result = problem.compareVersion(version1, version2);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test3() {
        String version1 = "1.0";
        String version2 = "1.0.0.0";

        int result = problem.compareVersion(version1, version2);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test4() {
        String version1 = "1.0";
        String version2 = "1.0.1.0";

        int result = problem.compareVersion(version1, version2);

        assertThat(result).isEqualTo(-1);
    }
}