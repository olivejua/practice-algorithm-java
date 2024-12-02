package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {
    private PartitioningIntoMinimumNumberOfDeciBinaryNumbers problem = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    public void test1() {
        String n = "32";

        int result = problem.minPartitions(n);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        String n = "82734";

        int result = problem.minPartitions(n);

        Assertions.assertThat(result).isEqualTo(8);
    }
}
