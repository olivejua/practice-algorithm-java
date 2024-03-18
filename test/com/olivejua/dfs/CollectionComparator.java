package com.olivejua.dfs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface CollectionComparator {
    // 리스트 내부에 동일한 정수 값을 가지고 있는지 확인하는 메소드
    static boolean listContainsSameValues(List<List<Integer>> lists, List<Integer> targetList) {
        for (List<Integer> list : lists) {
            if (list.size() == targetList.size()) {
                Set<Integer> listSet = new HashSet<>(list);
                Set<Integer> targetSet = new HashSet<>(targetList);
                if (listSet.equals(targetSet)) {
                    return true;
                }
            }
        }
        return false;
    }
}
