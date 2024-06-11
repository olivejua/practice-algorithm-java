package com.olivejua.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class SerializeAndDeserializeBinaryTreeTest {
    private final SerializeAndDeserializeBinaryTree PROBLEM = new SerializeAndDeserializeBinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2),
                new TreeNode(3,
                        new TreeNode(4),
                        new TreeNode(5))
        );

        String serialized = PROBLEM.serialize2(root);
        assertThat(serialized).isEqualTo("[1,2,3,null,null,4,5]");

//        TreeNode deserialized = PROBLEM.deserialize("[1,2,3,null,null,4,5]");
//        assertThat(deserialized.val).isEqualTo(1);
//
//        assertThat(deserialized.left.val).isEqualTo(2);
//        assertThat(deserialized.left.left).isNull();
//        assertThat(deserialized.left.right).isNull();
//
//        assertThat(deserialized.right.val).isEqualTo(3);
//        assertThat(deserialized.right.left.val).isEqualTo(4);
//        assertThat(deserialized.right.right.val).isEqualTo(5);
    }

    @Test
    public void test2() {
        String serialized = PROBLEM.serialize(null);
        assertThat(serialized).isEqualTo("[]");

//        TreeNode deserialized = PROBLEM.deserialize(null);
//        assertThat(deserialized).isNull();
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2),
                new TreeNode(3,
                        new TreeNode(4),
                        new TreeNode(5, new TreeNode(6), null))
        );

        String result1 = PROBLEM.serialize(root);
        System.out.println(result1);

        String result2 = PROBLEM.serialize2(root);
        System.out.println(result2);
    }

    @Test
    public void name() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(null);
        list.add(null);
        list.add(4);
        list.add(5);

        String data = list.toString().replaceAll(" ", "");
        System.out.println(data);

        System.out.println();

        List<Integer> parts = Arrays.stream(data
                .replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(","))
                .map(value -> value == null ? null : Integer.valueOf(value))
                .toList();

        System.out.println(parts);
    }
}