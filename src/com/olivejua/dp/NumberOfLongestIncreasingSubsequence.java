package com.olivejua.dp;

import java.util.ArrayList;
import java.util.List;

public class NumberOfLongestIncreasingSubsequence {

    public int findNumberOfLIS(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        for (int num : nums) {
            addNum(list, num);
        }

        return list.get(list.size()-1).size();
    }

    private void addNum(List<List<Integer>> list, int num) {
        if (list.isEmpty()) {
            List<Integer> first = new ArrayList<>();
            first.add(num);
            list.add(first);
            return;
        }

        int index = list.size() - 1;

        while (index >= 0) {
            List<Integer> last = list.get(index);

            if (last.get(0) < num) {
                List<Integer> addedList = list.size()-1 == index ? new ArrayList<>() : list.get(index + 1);
                // last에서 num보다 작은 숫자 수만큼 추가

                for (int i = last.size() -1; i >= 0 ; i--) {
                    if (last.get(i) < num) {
                        addedList.add(num);
                    }
                }

                addedList.sort(Integer::compareTo);
                list.add(index+1, addedList);
                return;
            }

            index--;
        }

        list.get(0).add(num);
        list.get(0).sort(Integer::compareTo);
    }
}
