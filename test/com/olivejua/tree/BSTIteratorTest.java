package com.olivejua.tree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BSTIteratorTest {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(7,
                new TreeNode(3),
                new TreeNode(15,
                        new TreeNode(9),
                        new TreeNode(20)));

        BSTIterator2 bstIterator = new BSTIterator2(root);

        assertThat(bstIterator.next()).isEqualTo(3);
        assertThat(bstIterator.next()).isEqualTo(7);
        assertThat(bstIterator.hasNext()).isTrue();
        assertThat(bstIterator.next()).isEqualTo(9);
        assertThat(bstIterator.hasNext()).isTrue();
        assertThat(bstIterator.next()).isEqualTo(15);
        assertThat(bstIterator.hasNext()).isTrue();
        assertThat(bstIterator.next()).isEqualTo(20);
        assertThat(bstIterator.hasNext()).isFalse();
    }
}
