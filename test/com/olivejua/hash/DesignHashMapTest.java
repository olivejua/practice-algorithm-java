package com.olivejua.hash;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static java.util.Objects.hash;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class DesignHashMapTest {

    @Test
    public void test1() {
        DesignHashMap problem = new DesignHashMap();
        problem.put(1, 1);
        problem.put(2, 2);

        int val = problem.get(1);
        assertThat(val).isEqualTo(1);

        int val2 = problem.get(3);
        assertThat(val2).isEqualTo(-1);

        problem.put(2, 1);

        int val3 = problem.get(2);
        assertThat(val3).isEqualTo(1);

        problem.remove(2);

        int val4 = problem.get(2);
        assertThat(val4).isEqualTo(-1);
    }
}
