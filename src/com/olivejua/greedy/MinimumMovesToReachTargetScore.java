package com.olivejua.greedy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MinimumMovesToReachTargetScore {

    public int minMoves(int target, int maxDoubles) {
        List<Integer> doubleNumbers = new LinkedList<>();

        int targetCal = target;
        while (targetCal > 3 && doubleNumbers.size() < maxDoubles) {
            targetCal = targetCal / 2;
            doubleNumbers.add(0, targetCal);
        }

        int result = 0;
        int index = 1;
        while (index < target) {
            if (doubleNumbers.isEmpty()) {
                result += target - index;
                break;
            }

            Integer doubleNumber = doubleNumbers.remove(0);
            result += doubleNumber - index;
            index = doubleNumber * 2;
            result++;
        }


        return result;
    }
}
