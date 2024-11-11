package com.olivejua.stack;

import java.util.*;

public class NestedIterator implements Iterator<Integer> {
    private Deque<NestedInteger> stack = new ArrayDeque<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        for (int i = nestedList.size()-1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            if (stack.peek().isInteger()) {
                return true;
            }

            NestedInteger nestedInteger = stack.pop();
            List<NestedInteger> list = nestedInteger.getList();
            for (int i = list.size()-1; i >= 0; i--) {
                stack.push(list.get(i));
            }
        }

        return false;
    }
}
/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext())
 *     v[f()] = i.next();
 */
