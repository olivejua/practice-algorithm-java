package com.olivejua.string;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        int[] info = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            info[letter-'a'] = i;
        }

        List<Integer> result = new ArrayList<>();

        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentLast = info[s.charAt(i) - 'a'];
            if (end < currentLast) {
                end = currentLast;
            }

            if (end == i) {
                result.add(end-start+1);
                start = end+1;
            }
        }

        return result;
    }
}
