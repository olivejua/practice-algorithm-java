package com.olivejua.queue;

import java.util.*;

public class DeckRevealedIncreasing {

    public int[] deckRevealedIncreasing(int[] deck) {
        int[] sortedCards = Arrays.stream(deck).sorted().toArray();

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < deck.length; i++) {
            queue.add(i);
        }

        List<Integer> indexes = new ArrayList<>();
        while (!queue.isEmpty()) {
            Integer index = queue.pop();
            indexes.add(index);

            if (!queue.isEmpty()) {
                queue.add(queue.pop());
            }
        }

        int[] result = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            Integer index = indexes.get(i);
            result[i] = sortedCards[index];
        }

        return result;
    }
}
