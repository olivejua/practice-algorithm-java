package com.olivejua.hash;

import java.util.HashMap;
import java.util.Iterator;

public class Disguise {

    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hash = new HashMap<>();

        for (String[] clothe : clothes) {
            String kind = clothe[1];

            hash.put(kind, hash.getOrDefault(kind, 0)+1);
        }

        Iterator<String> keys = hash.keySet().iterator();
        while(keys.hasNext()) {
            String key = keys.next();
            answer *= (hash.get(key) +1);
        }

        return answer - 1;
    }
}
