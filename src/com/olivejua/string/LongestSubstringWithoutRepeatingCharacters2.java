package com.olivejua.string;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters2 {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int[] visited = new int[128];
        Arrays.fill(visited, -1);

        int longestString = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (visited[current] != -1 && visited[current] >= start && visited[current] <= end) {
                start = visited[current] + 1;
            }

            end = i;
            longestString = Math.max(end-start+1, longestString);

            visited[current] = i;
        }

        return longestString;
    }
}
