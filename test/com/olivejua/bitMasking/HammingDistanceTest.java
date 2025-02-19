package com.olivejua.bitMasking;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class HammingDistanceTest {
    private final HammingDistance problem = new HammingDistance();

    @Test
    public void test1() {
        int result = problem.hammingDistance(1, 4);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        int result = problem.hammingDistance(1, 6);

        assertThat(result).isEqualTo(3);
    }
}
