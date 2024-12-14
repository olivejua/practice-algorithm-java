package com.olivejua.hash;

import java.util.*;

public class ConvertAnArrayIntoA2DArrayWithConditions {

    //시간복잡도: O(n + m²), 공간복잡도: O(n + m)
    //nums.length = n
    //nums 고유숫자 개수 = m
    public List<List<Integer>> findMatrix(int[] nums) {
        //공간복잡도: O(n)
        List<List<Integer>> result = new ArrayList<>();

        //공간복잡도: O(m)
        Map<Integer, Integer> dict = new HashMap<>();

        //시간복잡도: O(n)
        for (int num : nums) {
            dict.put(num, dict.getOrDefault(num, 0) + 1);
        }

        //시간 복잡도: O(m²) = m + (m-1) + (m-2) + ... + 1
        while (!dict.isEmpty()) {
            //공간복잡도: O(m)
            Set<Integer> keys = dict.keySet();
            result.add(new ArrayList<>(keys));

            //공간복잡도: Map.Entry 반복자, O(1)
            Iterator<Map.Entry<Integer, Integer>> iterator = dict.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();

                if (entry.getValue() == 1) {
                    iterator.remove();
                } else {
                    entry.setValue(entry.getValue()-1);
                }
            }
        }

        return result;
    }
}
