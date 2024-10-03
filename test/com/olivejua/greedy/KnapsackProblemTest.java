package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class KnapsackProblemTest {
    private KnapsackProblem problem = new KnapsackProblem();

    @Test
    public void test1() {
        int maxWeight = 15;
        List<KnapsackProblem.Cargo> cargos = new ArrayList<>();
        cargos.add(new KnapsackProblem.Cargo(4, 12));
        cargos.add(new KnapsackProblem.Cargo(2, 1));
        cargos.add(new KnapsackProblem.Cargo(10, 4));
        cargos.add(new KnapsackProblem.Cargo(1, 1));
        cargos.add(new KnapsackProblem.Cargo(2, 2));

        float result = problem.fractionalKnapsack(maxWeight, cargos);
        Assertions.assertThat(result).isEqualTo(17.333334f);
    }
}
