package com.olivejua.greedy;

import java.util.Arrays;

public class GasStation {

    public int canCompleteCircuit_b(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() - Arrays.stream(cost).sum() < 0) {
            return -1;
        }

        for (int start = 0; start < gas.length; start++) {
            int cur_gas = 0;

            for (int cur_pos = start; cur_pos < start + gas.length; cur_pos++) {
                int index = cur_pos % gas.length;

                cur_gas += gas[index] - cost[index];
                if (cur_gas < 0) {
                    break;
                }
            }

            if (cur_gas >= 0) {
                return start;
            }
        }

        return -1;
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() - Arrays.stream(cost).sum() < 0) {
            return -1;
        }

        int start = 0, fuel = 0;
        for (int i = 0; i < gas.length; i++) {
            if (fuel + gas[i] - cost[i] < 0) {
                start = i + 1;
                fuel = 0;
            } else {
                fuel += gas[i] - cost[i];
            }
        }

        return start;
    }
}
