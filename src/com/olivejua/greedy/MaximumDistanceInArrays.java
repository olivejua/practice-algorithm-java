package com.olivejua.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MaximumDistanceInArrays {

    public int maxDistance(List<List<Integer>> arrays) {
        int[] minValue = new int[3];
        int[] maxValue = new int[3];

        int[] backupMinValue = new int[3];
        int[] backupMaxValue = new int[3];

        //init
        Integer firstMinValue = arrays.get(0).get(0);
        Integer firstMaxValue = arrays.get(0).get(arrays.get(0).size()-1);
        Integer secondMinValue = arrays.get(1).get(0);
        Integer secondMaxValue = arrays.get(1).get(arrays.get(1).size()-1);

        if (firstMaxValue - secondMinValue > secondMaxValue - firstMinValue) {
            minValue[0] = secondMinValue;
            minValue[1] = 1;
            minValue[2] = 0;
            backupMinValue[0] = firstMinValue;
            backupMinValue[1] = 0;
            backupMinValue[2] = 0;

            maxValue[0] = firstMaxValue;
            maxValue[1] = 0;
            maxValue[2] = arrays.get(0).size()-1;
            backupMaxValue[0] = secondMaxValue;
            backupMaxValue[1] = 1;
            backupMaxValue[2] = arrays.get(1).size()-1;
        } else {
            minValue[0] = firstMinValue;
            minValue[1] = 0;
            minValue[2] = 0;
            backupMinValue[0] = secondMinValue;
            backupMinValue[1] = 1;
            backupMinValue[2] = 0;

            maxValue[0] = secondMaxValue;
            maxValue[1] = 1;
            maxValue[2] = arrays.get(1).size()-1;
            backupMaxValue[0] = firstMaxValue;
            backupMaxValue[1] = 0;
            backupMaxValue[2] = arrays.get(0).size()-1;
        }


        for (int i = 2; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            Integer eachMinValue = array.get(0);
            Integer eachMaxValue = array.get(array.size()-1);

            boolean isLess = eachMinValue < minValue[0];
            boolean isGreater = eachMaxValue > maxValue[0];
            //-2 - -10 = 8 , 3 - -8 = 11
            if (isLess && isGreater) {
                // 더 차이가 많이 나는 쪽으로 업데이트
                if (eachMaxValue - minValue[0] > maxValue[0] - eachMinValue) {
                    //max 업데이트
                    maxValue[0] = eachMaxValue;
                    maxValue[1] = i;
                    maxValue[2] = array.size()-1;

                    backupMinValue[0] = eachMinValue;
                    backupMinValue[1] = i;
                    backupMinValue[2] = 0;
                } else {
                    //min 업데이트
                    minValue[0] = eachMinValue;
                    minValue[1] = i;
                    minValue[2] = 0;

                    backupMaxValue[0] = eachMaxValue;
                    backupMaxValue[1] = i;
                    backupMaxValue[2] = array.size()-1;
                }
            } else if (isLess) {
                if (backupMinValue[0] > minValue[0]) {
                    backupMinValue[0] = minValue[0];
                    backupMinValue[1] = minValue[1];
                    backupMinValue[2] = minValue[2];
                }

                minValue[0] = eachMinValue;
                minValue[1] = i;
                minValue[2] = 0;
            } else if (isGreater) {
                if (backupMaxValue[0] < maxValue[0]) {
                    backupMaxValue[0] = maxValue[0];
                    backupMaxValue[1] = maxValue[1];
                    backupMaxValue[2] = maxValue[2];
                }

                maxValue[0] = eachMaxValue;
                maxValue[1] = i;
                maxValue[2] = array.size()-1;
            }
        }

        int result = maxValue[0] - minValue[0];

        if (backupMaxValue[1] != minValue[1]) {
            result = Math.max(result, backupMaxValue[0] - minValue[0]);
        }

        if (maxValue[1] != backupMinValue[1]) {
            result = Math.max(result, maxValue[0] - backupMinValue[0]);
        }

        if (backupMaxValue[1] != backupMinValue[1]) {
            result = Math.max(result, backupMaxValue[0] - backupMinValue[0]);
        }

        return result;
    }
}
