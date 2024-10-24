package com.olivejua.graph;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EvaluateDivisionTest {
    private EvaluateDivision problem = new EvaluateDivision();

    @Test
    public void test1() {
        List<List<String>> equations = List.of(
                List.of("a","b"), List.of("b","c"));
        double[] values = {2.0, 3.0};
        List<List<String>> queries = List.of(
                List.of("a","c"), List.of("b","a"), List.of("a","e"), List.of("a","a"), List.of("x","x"));

        double[] result = problem.calcEquation(equations, values, queries);

        assertThat(result).containsExactly(6.00000,0.50000,-1.00000,1.00000,-1.00000);
    }

    @Test
    public void test2() {
        List<List<String>> equations = List.of(
                List.of("a","b"), List.of("b","c"), List.of("bc","cd"));
        double[] values = {1.5,2.5,5.0};
        List<List<String>> queries = List.of(
                List.of("a","c"), List.of("c","b"), List.of("bc","cd"), List.of("cd","bc"));

        double[] result = problem.calcEquation(equations, values, queries);

        assertThat(result).containsExactly(3.75000,0.40000,5.00000,0.20000);
    }

    @Test
    public void test3() {
        List<List<String>> equations = List.of(
                List.of("a","e"), List.of("b","e"));
        double[] values = {4.0,3.0};
        List<List<String>> queries = List.of(
                List.of("a","b"), List.of("e","e"), List.of("x","x"));

        double[] result = problem.calcEquation(equations, values, queries);
        System.out.println(Arrays.toString(result));

        assertThat(result).containsExactly(1.33333,1.00000,-1.00000);
    }

    @Test
    public void test4() {
        List<List<String>> equations = List.of(
                List.of("x1","x2"), List.of("x2","x3"), List.of("x3","x4"), List.of("x4","x5"));
        double[] values = {3.0,4.0,5.0,6.0};
        List<List<String>> queries = List.of(
                List.of("x1","x5"), List.of("x5","x2"), List.of("x2","x4"), List.of("x2","x2"), List.of("x2","x9"), List.of("x9","x9"));

        double[] result = problem.calcEquation(equations, values, queries);
        System.out.println(Arrays.toString(result));

        assertThat(result).containsExactly(360.00000,0.00833,20.00000,1.00000,-1.00000,-1.00000);
    }

    @Test
    public void test5() {
        List<List<String>> equations = List.of(
                List.of("a","b"), List.of("e","f"), List.of("b","e"));
        double[] values = {3.4,1.4,2.3};
        List<List<String>> queries = List.of(
                List.of("b","a"), List.of("a","f"), List.of("f","f"), List.of("e","e"), List.of("c","c"), List.of("a","c"), List.of("f","e"));

        double[] result = problem.calcEquation(equations, values, queries);
        System.out.println(Arrays.toString(result));

        assertThat(result).containsExactly(0.29412,10.94800,1.00000,1.00000,-1.00000,-1.00000,0.71429);
    }

    @Test
    public void name() {
        double result = truncateToFiveDecimalPlaces(100.333333333);
        System.out.println("result = " + result);
    }

    static double truncateToFiveDecimalPlaces(double value) {
        // 소수점 5자리 남기고 버리기
        double scale = Math.pow(10, 5); // 10^5 = 100000
        return Math.floor(value * scale) / scale;
    }
}
