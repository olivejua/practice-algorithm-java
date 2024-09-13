package com.olivejua.array;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class SnapshotArray2 {
    private final List<TreeMap<Integer, Integer>> snapshots;
    private int snapId;

    public SnapshotArray2(int length) {
        snapshots = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            snapshots.add(new TreeMap<>());
            snapshots.get(i).put(0, 0);
        }
        snapId = 0;
    }

    public void set(int index, int val) {
        snapshots.get(index).put(snapId, val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        TreeMap<Integer, Integer> snapMap = snapshots.get(index);
        return snapMap.floorEntry(snap_id).getValue();
    }
}
