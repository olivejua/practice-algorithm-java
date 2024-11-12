package com.olivejua.queue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NestedIteratorTest {
    private NestedIterator problem;

    @Test
    public void test1() {
        //[[1,1],2,[1,1]]
        List<NestedInteger> nestedList = new ArrayList<>();
        nestedList.add(new NestedIteratorTest.NestedIntegerImpl(new NestedIteratorTest.NestedIntegerImpl(1), new NestedIteratorTest.NestedIntegerImpl(1)));
        nestedList.add(new NestedIteratorTest.NestedIntegerImpl(2));
        nestedList.add(new NestedIteratorTest.NestedIntegerImpl(new NestedIteratorTest.NestedIntegerImpl(1), new NestedIteratorTest.NestedIntegerImpl(1)));

        problem = new NestedIterator(nestedList);

        //[1,1,2,1,1]
        assertThat(problem.hasNext()).isTrue();
        assertThat(problem.next()).isEqualTo(1);
        assertThat(problem.hasNext()).isTrue();
        assertThat(problem.next()).isEqualTo(1);
        assertThat(problem.hasNext()).isTrue();
        assertThat(problem.next()).isEqualTo(2);
        assertThat(problem.hasNext()).isTrue();
        assertThat(problem.next()).isEqualTo(1);
        assertThat(problem.hasNext()).isTrue();
        assertThat(problem.next()).isEqualTo(1);
        assertThat(problem.hasNext()).isFalse();
    }

    @Test
    public void test2() {
        // [1,[4,[6]]]
        List<NestedInteger> nestedList = new ArrayList<>();
        nestedList.add(new NestedIteratorTest.NestedIntegerImpl(1));
        nestedList.add(new NestedIteratorTest.NestedIntegerImpl(new NestedIteratorTest.NestedIntegerImpl(4), new NestedIteratorTest.NestedIntegerImpl(new NestedIteratorTest.NestedIntegerImpl(6))));

        problem = new NestedIterator(nestedList);

        //[1,4,6]
        assertThat(problem.hasNext()).isTrue();
        assertThat(problem.next()).isEqualTo(1);
        assertThat(problem.hasNext()).isTrue();
        assertThat(problem.next()).isEqualTo(4);
        assertThat(problem.hasNext()).isTrue();
        assertThat(problem.next()).isEqualTo(6);
        assertThat(problem.hasNext()).isFalse();
    }

    @Test
    public void test3() {
        // [[]]
        List<NestedInteger> nestedList = new ArrayList<>();
        nestedList.add(new NestedIteratorTest.NestedIntegerImpl(new NestedIteratorTest.NestedIntegerImpl()));

        problem = new NestedIterator(nestedList);

        //[[]]
        assertThat(problem.hasNext()).isFalse();
    }

    @Test
    public void test4() {
        // [[], [3]]
        List<NestedInteger> nestedList = new ArrayList<>();
        nestedList.add(new NestedIteratorTest.NestedIntegerImpl(new NestedIteratorTest.NestedIntegerImpl()));
        nestedList.add(new NestedIteratorTest.NestedIntegerImpl(new NestedIteratorTest.NestedIntegerImpl(3)));

        problem = new NestedIterator(nestedList);

        //[[]]
        assertThat(problem.hasNext()).isTrue();
        assertThat(problem.next()).isEqualTo(3);
        assertThat(problem.hasNext()).isFalse();
    }

    static class NestedIntegerImpl implements NestedInteger {
        private Integer number;
        private List<NestedInteger> nestedIntegers = new ArrayList<>();

        public NestedIntegerImpl(Integer number) {
            this.number = number;
        }

        public NestedIntegerImpl(NestedInteger... numbers) {
            nestedIntegers.addAll(Arrays.asList(numbers));
        }

        @Override
        public boolean isInteger() {
            return number != null;
        }

        @Override
        public Integer getInteger() {
            return number;
        }

        @Override
        public List<NestedInteger> getList() {
            return nestedIntegers;
        }
    }
}
