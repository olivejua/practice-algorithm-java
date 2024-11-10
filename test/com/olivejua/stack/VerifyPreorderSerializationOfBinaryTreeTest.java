package com.olivejua.stack;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class VerifyPreorderSerializationOfBinaryTreeTest {
    private final VerifyPreorderSerializationOfBinaryTree problem = new VerifyPreorderSerializationOfBinaryTree();

    @Test
    public void test1() {
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";

        boolean result = problem.isValidSerialization(preorder);

        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void test2() {
        String preorder = "1,#";

        boolean result = problem.isValidSerialization(preorder);

        Assertions.assertThat(result).isEqualTo(false);
    }

    @Test
    public void test3() {
        String preorder = "9,#,#,1";

        boolean result = problem.isValidSerialization(preorder);

        Assertions.assertThat(result).isEqualTo(false);
    }
}
