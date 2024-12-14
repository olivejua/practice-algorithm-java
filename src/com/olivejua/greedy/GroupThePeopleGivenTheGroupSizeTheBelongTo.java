package com.olivejua.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheBelongTo {

    // 시간복잡도: O(n), 공간복잡도: O(n)
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int person = i;
            int groupSize = groupSizes[i];

            groups.computeIfAbsent(groupSize, k -> new ArrayList<>());

            List<Integer> group = groups.get(groupSize);
            group.add(person);

            if (group.size() == groupSize) {
                result.add(group);
                groups.remove(groupSize);
            }
        }

        return result;
    }
}
