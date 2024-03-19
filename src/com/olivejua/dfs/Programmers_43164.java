package com.olivejua.dfs;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/43164
 */
public class Programmers_43164 {
    public String[] solution(String[][] tickets) {
        List<String> result = new ArrayList<>();

        Map<String, PriorityQueue<String>> dictionary = new HashMap<>();
        for (String[] ticket : tickets) {
            String departure = ticket[0];
            String destination = ticket[1];

            dictionary.putIfAbsent(departure, new PriorityQueue<>());
            PriorityQueue<String> queue = dictionary.get(departure);
            queue.add(destination);
        }

        Stack<String> stack = new Stack<>();
        stack.push("ICN");

        while (!stack.isEmpty()) {
            while (dictionary.containsKey(stack.peek()) && !dictionary.get(stack.peek()).isEmpty()) {
                stack.push(dictionary.get(stack.peek()).poll());
            }

            result.add(0, stack.pop());
        }

        return result.toArray(new String[0]);
    }

    public void dfs(List<String> result, Map<String, List<String>> dictionary) {
        if (dictionary.isEmpty()) {
            return;
        }

        if (result.isEmpty()) {
            String departure = dictionary.keySet().iterator().next();
            List<String> destinations = dictionary.get(departure);

            result.add(departure);
            result.add(destinations.remove(0));

            if (destinations.isEmpty()) {
                dictionary.remove(departure);
            }

            dfs(result, dictionary);
        }

        String latestDestination = result.get(result.size() - 1);

        for (String departure : dictionary.keySet()) {
            if (latestDestination.equals(departure)) {
                List<String> destinations = dictionary.get(departure);
                result.add(destinations.remove(0));

                if (destinations.isEmpty()) {
                    dictionary.remove(departure);
                }

                dfs(result, dictionary);

                break;
            }
        }
    }
}
