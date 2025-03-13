package com.olivejua.array;

public class MinimumAmountOfTimeToCollectGarbage {
    public int garbageCollection(String[] garbage, int[] travel) {
        // 0: Metal, 1: Paper, 2: Glass
        int[] trucks = new int[3]; // 소요시간
        int[] last_visit = new int[3]; // 마지막 방문 House

        for (char unit : garbage[0].toCharArray()) {
            trucks[unitIdx(unit)] += 1;
        }

        for (int i = 1; i < garbage.length; i++) {
            if (i > 1) {
                travel[i-1] += travel[i-2];
            }

            for (char unit : garbage[i].toCharArray()) {
                int unitIdx = unitIdx(unit);
                trucks[unitIdx] += 1;

                if (last_visit[unitIdx] != i) {
                    if (last_visit[unitIdx] == 0) {
                        trucks[unitIdx] += travel[i-1];
                    } else {
                        trucks[unitIdx] += travel[i-1] - travel[last_visit[unitIdx]-1];
                    }
                }

                last_visit[unitIdx] = i;
            }
        }

        int result = 0;
        for (int truck : trucks) {
            result += truck;
        }

        return result;
    }

    private int unitIdx(char unit) {
        if (unit == 'M') {
            return 0;
        } else if (unit == 'P') {
            return 1;
        } else { // unit == 'G'
            return 2;
        }
    }
}
