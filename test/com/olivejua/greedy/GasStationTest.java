package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GasStationTest {
    private GasStation problem = new GasStation();

    @Test
    public void test1() {
        int[] gas = {5,1,2,3,4};
        int[] cost = {4,4,1,5,1};

        int result = problem.canCompleteCircuit(gas, cost);

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void test2() {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        int result = problem.canCompleteCircuit(gas, cost);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test3() {
        int[] gas = {2,3,4};
        int[] cost = {3,4,5};

        int result = problem.canCompleteCircuit(gas, cost);

        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test4() {
        int[] gas = {5,8,2,8};
        int[] cost = {6,5,6,6};

        int result = problem.canCompleteCircuit(gas, cost);

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test5() {
        int[] gas = {2};
        int[] cost = {2};

        int result = problem.canCompleteCircuit(gas, cost);

        Assertions.assertThat(result).isEqualTo(0);
    }
}
