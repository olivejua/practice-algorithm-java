package com.olivejua.stack;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvaluateReversePolishNotationTest {
    private final EvaluateReversePolishNotation problem = new EvaluateReversePolishNotation();

    @Test
    public void test1() {
        String[] tokens = {"2","1","+","3","*"};

        int result = problem.evalRPN(tokens);

        assertThat(result).isEqualTo(9);
    }

    @Test
    public void test2() {
        String[] tokens = {"4","13","5","/","+"};

        int result = problem.evalRPN(tokens);

        assertThat(result).isEqualTo(6);
    }

    @Test
    public void test3() {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        int result = problem.evalRPN(tokens);

        assertThat(result).isEqualTo(22);
    }

    @Test
    public void test4() {
        String[] tokens = {"18"};

        int result = problem.evalRPN(tokens);

        assertThat(result).isEqualTo(18);
    }
}
