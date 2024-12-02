package com.olivejua.queue;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckRevealedIncreasingTest {
    private final DeckRevealedIncreasing problem = new DeckRevealedIncreasing();

    @Test
    public void test1() {
        int[] deck = {17,13,11,2,3,5,7};

        int[] result = problem.deckRevealedIncreasing(deck);

        Assertions.assertThat(result).containsExactly(2,13,3,11,5,17,7);
    }
}
