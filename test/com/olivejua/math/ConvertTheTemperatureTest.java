package com.olivejua.math;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ConvertTheTemperatureTest {
    private final ConvertTheTemperature problem = new ConvertTheTemperature();

    @Test
    public void test1() {
        double[] result = problem.convertTemperature(36.50);

        System.out.println("result = " + Arrays.toString(result));

    }
}
