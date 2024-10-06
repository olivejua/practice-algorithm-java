package com.olivejua.greedy;

import java.util.*;

public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();

        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue((i1, i2) -> i2 - i1));
        pq.addAll(map.entrySet());

        List<Character> result = new ArrayList<>();

        Queue<Map.Entry<Character, Integer>> waitQueue = new LinkedList<>();

        //[A, B, C, (D X) A, B, C, A, B, C, D, E, ?, D]
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            Character character = entry.getKey();
            Integer count = entry.getValue();

            result.add(character);

            if (character == '?' || count == 1) {
                continue;
            }

            entry.setValue(count - 1);

            waitQueue.offer(entry);

            if (waitQueue.size() >= n) {
                pq.offer(waitQueue.poll());
            }

//            int idleCount = n - pq.size();
//            if (idleCount > 0) {
//                for (int i = 0; i < idleCount; i++) {
//                    pq.add(new AbstractMap.SimpleEntry<>('?', 1));
//                }
//            }

//            pq.add(entry);
        }

        System.out.println(Arrays.toString(result.toArray()));
        return result.size();
    }

    public int leastInterval2(char[] tasks, int n) {
        int[] freqs = new int[26];
        for (char task : tasks) {
            freqs[task-'A']++;
        }

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int freq : freqs) {
            if (freq > 0) {
                pq.add(freq);
            }
        }

        int result = 0;

        while (true) {
            int intervals = 0;
            List<Integer> list = new ArrayList<>();

            while (!pq.isEmpty()) {
                int frequency = pq.poll();

                if (intervals < n + 1) {
                    intervals++;
                    result++;

                    if (frequency > 1) {
                        list.add(frequency - 1);
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

    }
}
