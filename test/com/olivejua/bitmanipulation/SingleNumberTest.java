package com.olivejua.bitmanipulation;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SingleNumberTest {
    private final SingleNumber problem = new SingleNumber();

    @Test
    public void test1() {
        int[] nums = {1,2,1};

        int result = problem.singleNumber(nums);

        Assertions.assertThat(result).isEqualTo(2);
    }
}
