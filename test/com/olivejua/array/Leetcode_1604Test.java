package com.olivejua.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Leetcode_1604Test {
    private final Leetcode_1604_2 problem = new Leetcode_1604_2();

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

    @Test
    public void name() {

        List<int[]> list = new ArrayList<>();
        list.add(new int[] {11, 00});
        list.add(new int[] {10, 50});
        list.add(new int[] {10, 50});
        list.add(new int[] {9, 13});
        list.add(new int[] {11, 30});

        Collections.sort(list, (e1, e2) -> {
            if (e1[0] < e2[0]) {
                return -1;
            } else if (e1[0] > e2[0]) {
                return 1;
            }

            if (e1[1] < e2[1]) {
                return -1;
            } else if (e1[1] > e2[1]) {
                return 1;
            }

            return 0;
        });

        for (int[] e : list) {
            System.out.printf("hours: %d, minutes: %d \n", e[0], e[1]);
        }


    }
}