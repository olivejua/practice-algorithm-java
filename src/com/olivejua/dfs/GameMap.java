package com.olivejua.dfs;

import java.util.*;

public class GameMap {
    static class Position {
        int x;
        int y;
        int distance;

        public Position(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return x == position.x && y == position.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        public boolean isEnd(int[][] position) {
            return x == (position.length - 1) && y == (position[x].length - 1);
        }
    }

    public int solution(int[][] map) {
        // (좌표, 누적거리)
        Queue<Position> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));
        pq.add(new Position(0, 0, 1));

        while(!pq.isEmpty()) {
            Position cur_pos = pq.poll();

            // 마지막 지점이 아니어야함
            if (cur_pos.isEnd(map)) {
                return cur_pos.distance;
            }

            // 방문했던 적이 없는 위치만 큐에 넣는다.
            if (map[cur_pos.x][cur_pos.y] == 1) {
                map[cur_pos.x][cur_pos.y] = 0;

                int alt = cur_pos.distance + 1;

                // 해당 위치가 음수가 아니면서 좌표의 길이보다 이상인 인덱스가 아니어야한다.
                if (cur_pos.y+1 < map[cur_pos.x].length && map[cur_pos.x][cur_pos.y+1] == 1) {
                    pq.add(new Position(cur_pos.x, cur_pos.y+1, alt));
                }

                if (cur_pos.x+1 < map.length && map[cur_pos.x+1][cur_pos.y] == 1) {
                    pq.add(new Position(cur_pos.x+1, cur_pos.y, alt));
                }

                if (0 <= cur_pos.y-1 && map[cur_pos.x][cur_pos.y-1] == 1) {
                    pq.add(new Position(cur_pos.x, cur_pos.y-1, alt));
                }

                if (0 <= cur_pos.x-1 && map[cur_pos.x-1][cur_pos.y] == 1) {
                    pq.add(new Position(cur_pos.x-1, cur_pos.y, alt));
                }
            }
        }

        return -1;
    }


    Queue<Position> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.distance));

    public void findPath(int y, int x, int distance, int[][] maps) {
        if (y >= 0 &&
                y < maps.length &&
                x >= 0 &&
                x < maps[0].length &&
                maps[y][x] != 0) {
            maps[y][x] = 0;
            // 현재 위치와 거리 + 1을 우선순위 큐에 삽입
            pq.add(new Position(y, x, distance));
        }
    }

    public int solution2(int[][] maps) {
        pq.add(new Position(0, 0, 1));
        Map<Integer, Position> dist = new LinkedHashMap<>();

        while (!pq.isEmpty()) {
            Position cur = pq.poll();

            if (!dist.containsKey(cur.y * 1000 + cur.x)) {
                dist.put(cur.y * 1000 + cur.x, cur);

                findPath(cur.y, cur.x + 1, cur.distance, maps);
                findPath(cur.y, cur.x - 1, cur.distance, maps);
                findPath(cur.y + 1, cur.x, cur.distance, maps);
                findPath(cur.y - 1, cur.x, cur.distance, maps);
            }
        }

        if (dist.containsKey((maps.length - 1) * 1000 + (maps[0].length - 1))) {
            return dist.get(((maps.length - 1) * 1000 + (maps[0].length - 1))).distance;
        }

        return -1;
    }


}
