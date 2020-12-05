package com.olivejua;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i=0; i<completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[i];
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) +1);
        }

        System.out.println("1)" + hm);

        for(String player : completion) {
            hm.put(player, hm.get(player) -1);
        }

        System.out.println("2)" + hm);

        for(String key : hm.keySet()) {
            if(hm.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
}
