package com.olivejua.hash;

import java.util.HashMap;

public class UnfinishedRunner {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hash = new HashMap<>();

        for (String p : participant) {
            if (hash.containsKey(p)) {
                hash.put(p, hash.get(p)+1);
            } else {
                hash.put(p, 1);
            }
        }

        for (String p : completion) {
            if (0 < hash.get(p)) {
                hash.put(p, hash.get(p)-1);
            }
        }

        for (String key : hash.keySet()) {
            if (0 < hash.get(key)) {
                answer = key;
            }
        }

        return answer;
    }

    public String solution_better(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            hm.put(player, hm.get(player)-1);
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
}
