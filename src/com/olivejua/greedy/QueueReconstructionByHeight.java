package com.olivejua.greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] != b[0] ? b[0] - a[0] : a[1] - b[1]);

        pq.addAll(Arrays.asList(people));

        List<int[]> result = new LinkedList<>();
        while (!pq.isEmpty()) {
            int[] person = pq.poll();

            if (person[1] >= result.size()) {
                result.add(person);
            } else {
                int count = 0;
                int insertIndex = result.size();

                for (int i = 0; i < result.size(); i++) {
                    if (count == person[1]) {
                        insertIndex = i;
                        break;
                    }

                    if (result.get(i)[0] >= person[0]) {
                        count++;
                    }
                }

                result.add(insertIndex, person);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public int[][] reconstructQueue2(int[][] people) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] != b[0] ? b[0] - a[0] : a[1] - b[1]);

        pq.addAll(Arrays.asList(people));

        List<int[]> result = new LinkedList<>();
        while (!pq.isEmpty()) {
            int[] person = pq.poll();

            result.add(person[1], person);
        }

        return result.toArray(new int[result.size()][]);
    }
}
