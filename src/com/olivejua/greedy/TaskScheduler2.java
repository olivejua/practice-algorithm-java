package com.olivejua.greedy;

import java.util.*;

public class TaskScheduler2 {

    public int leastInterval(char[] tasks, int n) {
        int[] freqs = new int[26];

        for (char task : tasks) {
            freqs[task-'A'] += 1;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int freq : freqs) {
            if (freq > 0) {
                pq.add(freq);
            }
        }

        int result = 0;
        while (true) {
            List<Integer> list = new ArrayList<>();
            int intervals = 0;

            while (!pq.isEmpty()) {
                Integer frequency = pq.poll();
                if (intervals < n + 1) {
                    intervals += 1;
                    result += 1;

                    if (frequency > 1) {
                        list.add(frequency-1);
                    }
                } else {
                    list.add(frequency);
                }
            }

            if (list.isEmpty()) {
                break;
            }

            pq.addAll(list);
            result += n + 1 - intervals;
        }

        return result;
    }
}
