package com.olivejua.array;

import java.util.ArrayList;
import java.util.List;

public class SnapshotArray {
    private final int[] array;
    private final List<int[]> snapshots = new ArrayList<>();
    private int generatedId = 0;

    public SnapshotArray(int length) {
        array = new int[length];
    }

    public void set(int index, int val) {
        array[index] = val;
    }

    public int snap() {
        int snapId = generatedId++;
        snapshots.add(snapId, array.clone());

        return snapId;
    }

    public int get(int index, int snap_id) {
        int[] snapshot = snapshots.get(snap_id);

        return snapshot[index];
    }
}
