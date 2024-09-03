package com.olivejua.array;

public class DesignHitCounter {
    private int[] hits;
    private int[] times;

    public DesignHitCounter() {
        this.hits = new int[300];
        this.times = new int[300];
    }

    public void hit(int timestamp) {
        int index = timestamp % 300;
        if (times[index] != timestamp) {
            times[index] = timestamp;
            hits[index] = 1;
        } else {
            hits[index]++;
        }
    }

    public int getHit(int timestamp) {
        int totalHits = 0;
        for (int i = 0; i < 300; i++) {
            if (timestamp - times[i] < 300) {
                totalHits += hits[i];
            }
        }

        return totalHits;
    }
}
