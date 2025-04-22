package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumArrayTest {

    @Test
    public void test1() {
        int[] nums = {1,3,5};
        NumArray numArray = new NumArray(nums);

        System.out.println("numArray = " + numArray);

        Assertions.assertThat(numArray.sumRange(0, 2)).isEqualTo(9);
        numArray.update(1, 2);
        Assertions.assertThat(numArray.sumRange(0, 2)).isEqualTo(9);
    }

    @Test
    public void lastBit() {
        int target = 12;
        System.out.println(target & 1);

        int lastBit = 1;
        while ((target & 1) == 0) {
            target >>= 1;
            lastBit <<= 1;
        }

        System.out.println("target = " + target);
        System.out.println("lastBit = " + lastBit);
    }

    @Test
    public void name() {
        System.out.println(3 & (-3));
    }

    @Test
    public void temp() {
        int target = 1;
        System.out.println(target);
        target <<= 1;
        System.out.println(target);
        target <<= 1;
        System.out.println(target);
        target <<= 1;
        System.out.println(target);
        target <<= 1;
        System.out.println(target);
    }

    @Test
    public void test2() {
        int target = 8;
        System.out.println(target);
        target >>= 1;
        System.out.println(target);
        target >>= 1;
        System.out.println(target);
        target >>= 1;
        System.out.println(target);
        target >>= 1;
        System.out.println(target);
        target >>= 1;
        System.out.println(target);
        target >>= 1;
        System.out.println(target);
        target >>= 1;
        System.out.println(target);
    }
}
