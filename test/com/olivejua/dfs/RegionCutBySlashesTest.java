package com.olivejua.dfs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RegionCutBySlashesTest {
    private final RegionCutBySlashes2 problem = new RegionCutBySlashes2();

    @Test
    public void test1() {
        String[] grid = {
                " /",
                "/ "
        };

        int result = problem.regionsBySlashes(grid);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        String[] grid = {
                " /",
                "  "
        };

        int result = problem.regionsBySlashes(grid);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test3() {
        String[] grid = {
                "/\\",
                "\\/"
        };

        int result = problem.regionsBySlashes(grid);

        assertThat(result).isEqualTo(5);
    }
}
