package com.olivejua.dp;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = result.get(i - 1);

            List<Integer> thisRow = new ArrayList<>();
            thisRow.add(0, 1);
            for (int j = 1; j < i; j++) {
                thisRow.add(previousRow.get(j) + previousRow.get(j-1));
            }

            thisRow.add(1);
            result.add(thisRow);
        }

        return result;
    }
}
