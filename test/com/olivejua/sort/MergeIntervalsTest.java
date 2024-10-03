package com.olivejua.sort;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class MergeIntervalsTest {
    MergeIntervals problem;

    @Before
    public void setUp() throws Exception {
        problem = new MergeIntervals();
    }

    @Test
    public void test1() {
        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        int[][] result = problem.merge(intervals);

        assertThat(result.length).isEqualTo(3);
        assertThat(result[0]).isEqualTo(new int[]{1,6});
        assertThat(result[1]).isEqualTo(new int[]{8,10});
        assertThat(result[2]).isEqualTo(new int[]{15,18});

    }
}
