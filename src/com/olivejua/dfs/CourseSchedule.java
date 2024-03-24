package com.olivejua.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/course-schedule
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> finishToTakeMap = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            finishToTakeMap.putIfAbsent(prerequisite[0], new ArrayList<>());
            finishToTakeMap.get(prerequisite[0]).add(prerequisite[1]);
        }

        List<Integer> takes = new ArrayList<>();
        List<Integer> taken = new ArrayList<>();
        for (Integer finish : finishToTakeMap.keySet()) {
            if(!dfs(finishToTakeMap, finish, takes, taken)) {
                return false;
            }
        }

        return true;
    }


    /**
     * finish: 1
     * - (1) finishToTakeMap: [[1, 0], [2, 1]] / finish: 1 / takes: []
     * - (2) finishToTakeMap: [[1, 0], [2, 1]] / finish: 0 / takes: [1]
     *      > finishToTakeMap.containsKey(0) => true
     * - (1) finishToTakeMap: [[1, 0], [2, 1]] / finish: 1 / takes: []
     *
     * finish: 2
     * - (1) finishToTakeMap: [[1, 0], [2, 1]] / finish: 2 / takes: []
     * - (2) finishToTakeMap: [[1, 0], [2, 1]] / finish: 1 / takes: [2]
     * - (3) finishToTakeMap: [[1, 0], [2, 1]] / finish: 0 / takes: [2, 1]
     *      > finishToTakeMap.containsKey(0) => true
     * - (2) finishToTakeMap: [[1, 0], [2, 1]] / finish: 1 / takes: [2]
     * - (1) finishToTakeMap: [[1, 0], [2, 1]] / finish: 2 / takes: []
     */

    boolean dfs(Map<Integer, List<Integer>> finishToTakeMap, Integer finish, List<Integer> takes, List<Integer> taken) {
        if (takes.contains(finish)) {
            return false;
        }

        if (taken.contains(finish)) {
            return true;
        }

        if (finishToTakeMap.containsKey(finish)) {
            takes.add(finish);

            for (Integer take : finishToTakeMap.get(finish)) {
                if (!dfs(finishToTakeMap, take, takes, taken)) {
                    return false;
                }
            }

            takes.remove(finish);
            taken.add(finish);
        }

        return true;
    }
}
