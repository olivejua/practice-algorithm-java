package com.olivejua.graph;

import java.util.*;

public class FlowerPlantingWithNoAdjacent {

    public int[] gardenNoAdj(int n, int[][] paths) {
        int[] allocateFlowerTypes = new int[n];

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> value = new ArrayList<>();
            value.add(i);
            graph.put(i, value);
        }

        for (int[] path : paths) {
            graph.get(path[0]).add(path[1]);
            graph.get(path[1]).add(path[0]);
        }

        for (int i = 1; i <= n; i++) {
            Set<Integer> flowerTypes = getFlowerTypes();

            List<Integer> allocateGardens = new ArrayList<>();
            for (Integer garden : graph.get(i)) {
                if (allocateFlowerTypes[garden-1] == 0) {
                    allocateGardens.add(garden);
                } else {
                    flowerTypes.remove(allocateFlowerTypes[garden-1]);
                }
            }

            Iterator<Integer> iterator = flowerTypes.iterator();
            for (Integer allocateGarden : allocateGardens) {
                allocateFlowerTypes[allocateGarden-1] = iterator.next();
            }
        }

        return allocateFlowerTypes;
    }

    private static Set<Integer> getFlowerTypes() {
        LinkedHashSet<Integer> flowerTypes = new LinkedHashSet<>();
        flowerTypes.add(1);
        flowerTypes.add(2);
        flowerTypes.add(3);
        flowerTypes.add(4);
        return flowerTypes;
    }
}
