package com.olivejua.dfs;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class KeysAndRoomsTest {
    private final KeysAndRooms problem = new KeysAndRooms();

    @Test
    public void test1() {
        List<List<Integer>> rooms = List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of());

        boolean result = problem.canVisitAllRooms(rooms);

        assertThat(result).isTrue();
    }

    @Test
    public void test2() {
        List<List<Integer>> rooms = List.of(
                List.of(1,3),
                List.of(3,0,1),
                List.of(2),
                List.of(0));

        boolean result = problem.canVisitAllRooms(rooms);

        assertThat(result).isFalse();
    }

    @Test
    public void test3() {
        List<List<Integer>> rooms = List.of(
                List.of(2,3),
                List.of(),
                List.of(2),
                List.of(1,3));

        boolean result = problem.canVisitAllRooms(rooms);

        assertThat(result).isTrue();
    }
}
