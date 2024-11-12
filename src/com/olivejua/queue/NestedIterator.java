package com.olivejua.queue;

import java.util.*;

public class NestedIterator implements Iterator<Integer> {
    private Queue<NestedInteger> queue = new LinkedList<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        LinkedList<NestedInteger> list = new LinkedList<>();
        list.addAll(nestedList);

        while (!list.isEmpty()) {
            NestedInteger nestedInteger = list.poll();
            if (nestedInteger.isInteger()) {
                queue.add(nestedInteger);
            } else {
                list.addAll(0, nestedInteger.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return queue.poll().getInteger();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
