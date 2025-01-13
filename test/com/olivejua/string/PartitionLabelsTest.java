package com.olivejua.string;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PartitionLabelsTest {
    private PartitionLabels problem = new PartitionLabels();


    @Test
    public void test1() {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> result = problem.partitionLabels(s);

        assertThat(result).containsExactly(9,7,8);
    }

    @Test
    public void test2() {
        String s = "eccbbbbdec";
        List<Integer> result = problem.partitionLabels(s);

        assertThat(result).containsExactly(10);
    }
}