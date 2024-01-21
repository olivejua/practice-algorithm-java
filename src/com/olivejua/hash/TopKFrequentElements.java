package com.olivejua.hash;

import org.assertj.core.api.Assertions;

import java.util.*;

/**
 * https://elltcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements solution = new TopKFrequentElements();

//        int[] nums = {1, 1, 1, 2, 2, 3, 4};
        int[] nums = {1,1,1,2,2,2,3,3,3};
        int k = 3;

        int[] result = solution.topKFrequent3(nums, k);
        System.out.println(Arrays.toString(result));

        Assertions.assertThat(result).containsExactlyInAnyOrder(1, 2, 3);
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequentMap = new HashMap<>();
        for (int num : nums) {
            Integer cnt = frequentMap.getOrDefault(num, 0);
            cnt += 1;
            frequentMap.put(num, cnt);
        }

        List<Integer> frequentNumbersInDesc = new ArrayList<>(frequentMap.values());
        Collections.sort(frequentNumbersInDesc, Collections.reverseOrder());

        List<Integer> frequentNumbers = frequentNumbersInDesc.subList(0, k);

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> numEntry : frequentMap.entrySet()) {
            if (result.size() >= k) {
                break;
            }

            if (frequentNumbers.contains(numEntry.getValue())) {
                result.add(numEntry.getKey());
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Map<Integer, List<Integer>> buckets = new HashMap<>();
        for (Integer elem : frequencyMap.keySet()) {
            Integer frequency = frequencyMap.get(elem);
            List<Integer> elems = buckets.getOrDefault(frequency, new ArrayList<>());
            elems.add(elem);
            buckets.put(frequency, elems);
        }

        int[] result = new int[k];
        int index = 0;
        for (int frequency = nums.length; frequency > 0 && index < k; frequency--) {
            if (buckets.get(frequency) != null) {
                for (Integer elem : buckets.get(frequency)) {
                    result[index++] = elem;
                }
            }
        }

        return result;
    }

    public int[] topKFrequent3(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (Integer elem : frequencyMap.keySet()) {
            pq.add(new int[] {elem, frequencyMap.get(elem)});
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
        }

        return result;
    }
}
