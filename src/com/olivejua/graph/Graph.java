package com.olivejua.graph;

import java.util.*;

public class Graph {
    Map<Integer, List<Integer>> graph = new HashMap<>();

    public Graph() {
        adjacencyList();
    }

    public void adjacencyList() {
        graph.put(1, Arrays.asList(2,3,4));
        graph.put(2, Arrays.asList(5));
        graph.put(3, Arrays.asList(5));
        graph.put(4, Arrays.asList());
        graph.put(5, Arrays.asList(6,7));
        graph.put(6, Arrays.asList());
        graph.put(7, Arrays.asList(3));
    }

    public List<Integer> recursiveDFS(int v, List<Integer> discovered) {
        // 현재 노드 저장 (전위 순회)
        discovered.add(v);

        // 주변
        for (Integer w : graph.get(v)) {
            // 아직 처리되지 않은 노드라면 깊이 기반 탐색 진행
            if (!discovered.contains(w)) {
                discovered = recursiveDFS(w, discovered);
            }
        }

        return discovered;
    }

    public List<Integer> iterativeDFS(int v) {
        //결과 노드를 저장할 리스트 선언
        List<Integer> discovered = new ArrayList<>();

        //스택 선언은 효율적인 ArrayDeque 자료형 사용
        Deque<Integer> stack = new ArrayDeque<>();

        //현재 노드 스택에 삽입
        stack.add(v);

        while (!stack.isEmpty()) {
            v = stack.pop();

            if (!discovered.contains(v)) {
                discovered.add(v);

                for (Integer w : graph.get(v)) {
                    stack.push(w);
                }
            }
        }

        return discovered;
    }

    public List<Integer> iterativeBFS(int start_v) {
        //결과 노드를 저장할 리스트 선언
        List<Integer> discovered = new ArrayList<>();

        //시작 노드 삽입
        discovered.add(start_v);

        //큐는 인터페이스이며 자료형 선언은 LinkedList 사용
        Queue<Integer> queue = new LinkedList<>();
        //시작 노드 삽입
        queue.add(start_v);
        //큐가 비워질 때까지 반복
        while (!queue.isEmpty()) {
            //큐에서 추출
            int v = queue.poll();
            for (int w : graph.get(v)) {
                if (!discovered.contains(w)) {
                    discovered.add(w);
                    queue.add(w);
                }
            }
        }

        //더이상 탐색할 노드가 없으면 리턴
        return discovered;
    }
}
