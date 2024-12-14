package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class GroupThePeopleGivenTheGroupSizeTheBelongToTest {
    private final GroupThePeopleGivenTheGroupSizeTheBelongTo problem = new GroupThePeopleGivenTheGroupSizeTheBelongTo();

    @Test
    public void test1() {
        int[] groupSizes = {
                3,3,3,3,3,1,3
        };

        List<List<Integer>> result = problem.groupThePeople(groupSizes);

        assertThat(result.size()).isEqualTo(3);
        assertThat(result).containsExactlyInAnyOrderElementsOf(List.of(
                List.of(5),
                List.of(0,1,2),
                List.of(3,4,6)
        ));
    }

    @Test
    public void test2() {
        int[] groupSizes = {
                2,1,3,3,3,2
        };

        List<List<Integer>> result = problem.groupThePeople(groupSizes);

        assertThat(result.size()).isEqualTo(3);
        assertThat(result).containsExactlyInAnyOrderElementsOf(List.of(
                List.of(1),
                List.of(0,5),
                List.of(2,3,4)
        ));
    }
}
