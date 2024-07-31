package com.olivejua.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Leetcode_1604Test {
    private final Leetcode_1604 problem = new Leetcode_1604();

    @Test
    public void test1() {
        String[] names = {"daniel","daniel","daniel","luis","luis","luis","luis"};
        String[] times = {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};

        List<String> result = problem.alertNames(names, times);
        assertThat(result).containsExactlyInAnyOrder("daniel");
    }

    @Test
    public void test2() {
        String[] names = {"alice","alice","alice","bob","bob","bob","bob"};
        String[] times = {"12:01","12:00","18:00","21:00","21:20","21:30","23:00"};

        List<String> result = problem.alertNames(names, times);
        assertThat(result).containsExactlyInAnyOrder("bob");
    }
}