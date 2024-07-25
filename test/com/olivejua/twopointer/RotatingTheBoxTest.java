package com.olivejua.twopointer;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RotatingTheBoxTest {
    RotatingTheBox problem = new RotatingTheBox();

    @Test
    public void test1() {
        char[][] box = {
                {'#', '#', '*', '.', '*', '.'},
                {'#', '#', '#', '*', '.', '.'},
                {'#', '#', '#', '.', '#', '.'}
        };

        char[][] result = problem.rotate(box, 3, 6);

        System.out.println(Arrays.toString(result));

        assertThat(result.length).isEqualTo(6);
        assertThat(result[0].length).isEqualTo(3);
        assertThat(result[0]).containsExactly('#', '#', '#');
        assertThat(result[1]).containsExactly('#', '#', '#');
        assertThat(result[2]).containsExactly('#', '#', '*');
        assertThat(result[3]).containsExactly('.', '*', '.');
    }

    @Test
    public void test2() {
        char[][] box = {
                {'#', '#', '*', '.', '*', '.'},
                {'#', '#', '#', '*', '.', '.'},
                {'#', '#', '#', '.', '#', '.'}
        };

        char[][] result = problem.rotateTheBox(box);

        assertThat(result.length).isEqualTo(6);
        assertThat(result[0].length).isEqualTo(3);
        assertThat(result[0]).containsExactly('.','#','#');
        assertThat(result[1]).containsExactly('.','#','#');
        assertThat(result[2]).containsExactly('#','#','*');
        assertThat(result[3]).containsExactly('#','*','.');
        assertThat(result[4]).containsExactly('#','.','*');
        assertThat(result[5]).containsExactly('#','.','.');
    }

    @Test
    public void test3() {
        char[][] box = {{'#','.','#'}};

        char[][] result = problem.rotateTheBox(box);

        assertThat(result.length).isEqualTo(3);
        assertThat(result[0].length).isEqualTo(1);
        assertThat(result[0]).containsExactly('.');
        assertThat(result[1]).containsExactly('#');
        assertThat(result[2]).containsExactly('#');
    }

    @Test
    public void test4() {
        char[][] box = {
                {'#','.','*','.'},
                {'#','#','*','.'}
        };

        char[][] result = problem.rotateTheBox(box);

        assertThat(result.length).isEqualTo(4);
        assertThat(result[0].length).isEqualTo(2);
        assertThat(result[0]).containsExactly('#','.');
        assertThat(result[1]).containsExactly('#','#');
        assertThat(result[2]).containsExactly('*','*');
        assertThat(result[3]).containsExactly('.','.');
    }
}