package com.olivejua.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/alert-using-same-key-card-three-or-more-times-in-a-one-hour-period/description/
 */
public class Leetcode_1604_2 {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> result = new ArrayList<>();
        int n = keyName.length;

        Map<String, List<int[]>> visit = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = keyName[i];
            String time = keyTime[i];

            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);

            visit.putIfAbsent(name, new ArrayList<>());
            visit.get(name).add(new int[] {hours, minutes});
        }

        for (Map.Entry<String, List<int[]>> entry : visit.entrySet()) {
            String name = entry.getKey();
            List<int[]> history = entry.getValue();

            if (history.size() < 3) {
                continue;
            }

            history.sort((e1, e2) -> {
                if (e1[0] < e2[0]) {
                    return -1;
                } else if (e1[0] > e2[0]) {
                    return 1;
                }

                if (e1[1] < e2[1]) {
                    return -1;
                } else if (e1[1] > e2[1]) {
                    return 1;
                }

                return 0;
            });

            for (int i = 0; i < history.size()-2; i++) {
                int[] cur_time = history.get(i);
                int hours = cur_time[0], minutes = cur_time[1];

                int[] compared_time = history.get(i + 2);
                if (compared_time[0] == hours ||
                        (compared_time[0] == hours + 1 && compared_time[1] <= minutes)) {
                    result.add(name);
                    break;
                }
            }
        }

        return result;
    }
}
