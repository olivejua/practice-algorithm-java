package com.olivejua.array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class DesignHitCounterTest {

    @Test
    public void test1() {
        DesignHitCounter counter = new DesignHitCounter();
        counter.hit(1);
        counter.hit(2);
        counter.hit(3);

        int hit4 = counter.getHit(4);
        Assertions.assertThat(hit4).isEqualTo(3);

        counter.hit(300);

        int hit300 = counter.getHit(300);
        Assertions.assertThat(hit300).isEqualTo(4);

        int hit301 = counter.getHit(301);
        Assertions.assertThat(hit301).isEqualTo(3);
    }
}
