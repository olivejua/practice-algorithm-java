package com.olivejua.dfs;

import java.util.*;

public class KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms.isEmpty()) {
            return true;
        }

        Set<Integer> visited = new HashSet<>();
        return bfs(rooms, 0, visited);
    }

    private boolean dfs(List<List<Integer>> rooms, int room, Set<Integer> visited) {
        if (visited.contains(room)) {
            return false;
        }

        visited.add(room);

        List<Integer> keys = rooms.get(room);

        for (Integer key : keys) {
            boolean allVisited = dfs(rooms, key, visited);
            if (allVisited) {
                return true;
            }
        }

        return visited.size() == rooms.size();
    }

    private boolean bfs(List<List<Integer>> rooms, int start, Set<Integer> visited) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            Integer room = queue.poll();

            if (visited.contains(room)) {
                if (visited.size() == rooms.size()) {
                    return true;
                }

                continue;
            }

            visited.add(room);
            queue.addAll(rooms.get(room));
        }

        return visited.size() == rooms.size();
    }
}
