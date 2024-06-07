package com.olivejua.dfs;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NetworkDelayTimeTest {
    private final NetworkDelayTime PROBLEM = new NetworkDelayTime();

    @Test
    public void solve1() {
        int[][] times = {
                {3, 1, 5}
                , {3, 2, 2}
                , {2, 1, 2}
                , {3, 4, 1}
                , {4, 5, 1}
                , {5, 6, 1}
                , {6, 7, 1}
                , {7, 8, 1}
                , {8, 1, 1}
        };
        int n = 8;
        int k = 3;

        int result = PROBLEM.networkDelayTime(times, n, k);
        Assertions.assertThat(result).isEqualTo(5);
    }
}