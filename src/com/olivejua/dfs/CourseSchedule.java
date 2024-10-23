package com.olivejua.dfs;

import java.util.*;

/**
 * https://leetcode.com/problems/course-schedule
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            List<Integer> courses = graph.getOrDefault(prerequisite[0], new ArrayList<>());
            courses.add(prerequisite[1]);

            graph.put(prerequisite[0], courses);
        }

        for (int i = 0; i < numCourses; i++) {
            List<Integer> takes = new ArrayList<>();
            if (!dfs(i, takes, graph)) {
                return false;
            }
        }

        return true;
    }

    boolean dfs(int course, List<Integer> takes, Map<Integer, List<Integer>> graph) {
        if (takes.contains(course)) {
            return false;
        }

        if (!graph.containsKey(course) || graph.get(course).isEmpty()) {
            return true;
        }

        takes.add(course);
        List<Integer> preliminaryCourses = graph.get(course);
        Integer preliminaryCourse = preliminaryCourses.remove(0);
        return dfs(preliminaryCourse, takes, graph);
    }
}
