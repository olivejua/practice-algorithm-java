package com.olivejua.bitmanipulation;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FindTheOriginalArrayOfPrefixXorTest {
    private final FindTheOriginalArrayOfPrefixXor problem = new FindTheOriginalArrayOfPrefixXor();

    @Test
    public void test1() {
        int[] pref = new int[] {5,2,0,3,1};

        int[] result = problem.findArray(pref);

        Assertions.assertThat(result).containsExactly(5,7,2,3,2);
    }

    @Test
    public void test2() {
        int[] pref = new int[] {13};

        int[] result = problem.findArray(pref);

        Assertions.assertThat(result).containsExactly(13);
    }
}
