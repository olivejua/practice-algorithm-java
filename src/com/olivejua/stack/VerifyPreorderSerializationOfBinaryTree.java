package com.olivejua.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class VerifyPreorderSerializationOfBinaryTree {

    public boolean isValidSerialization(String preorder) {
        Deque<String> stack = new ArrayDeque<>();

        String[] parts = preorder.split(",");
        for (int i = parts.length-1; i >= 0; i--) {
            String character = parts[i];
            stack.push(character);
        }

        boolean result = verifyPreorder(stack);
        return result && stack.isEmpty();
    }

    boolean verifyPreorder(Deque<String> stack) {
        if (stack.isEmpty()) {
            return false;
        }

        String root = stack.pop();

        if (root.equals("#")) {
            return true;
        }

        boolean leftResult = verifyPreorder(stack);
        boolean rightResult = verifyPreorder(stack);

        return leftResult && rightResult;
    }

    public boolean isValidSerialization2(String preorder) {
        String[] nodes = preorder.split(",");
        int slots = 1;

        for (String node : nodes) {
            slots--;

            if (slots < 0) {
                return false;
            }

            if (!node.equals("#")) {
                slots += 2;
            }
        }

        return slots == 0;
    }
}
