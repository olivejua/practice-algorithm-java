package com.olivejua.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    /**
     * 1. 데이터 접근
     * 2. 접근 시간 갱신
     * 3. 캐시 가득 참
     * 4. 가장 오래된 데이터 제거
     * 5. 새로운 데이터 추가
     */

    private final int capacity;
    private final Map<Integer, Integer> cache;
    private final LinkedList<Integer> order;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.order = new LinkedList<>();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        order.remove((Integer) key);
        order.addFirst(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            order.remove((Integer) key);
        } else if (cache.size() == capacity) {
            int oldest = order.removeLast();
            cache.remove(oldest);
        }

        cache.put(key, value);
        order.addFirst(key);
    }
}
