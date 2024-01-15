package com.olivejua.hash;

public class MyHashMap {

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1)); // 1을 리턴한다
        System.out.println(hashMap.get(3)); // -1을 리턴한다
        System.out.println(hashMap.get(2)); // 2를 리턴한다
        hashMap.put(2, 1); // 값을 업데이트한다
        System.out.println(hashMap.get(2)); // 1을 리턴한다
        hashMap.remove(2); // 키 2에 해당하는 키, 값을 삭제한다
        System.out.println(hashMap.get(2)); // -1을 리턴한다(키가 삭제되어 존재하지 않음)
    }

    class Node {
        int key, val;
        Node nextNode;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node[] nodes = new Node[1_000_000];

    public MyHashMap() {

    }

    /**
     * 키, 값을 해시맵에 삽입한다. 만약 이미 존재하는 키라면 업데이트한다.
     */
    public void put(int key, int value) {
        int index = key % nodes.length;

        Node newNode = new Node(key, value);

        if (nodes[index] == null) {
            nodes[index] = newNode;
            return;
        }

        Node existedNode = nodes[index];
        while (existedNode.nextNode != null) {
            existedNode = existedNode.nextNode;
        }

        existedNode.nextNode = newNode;
    }

    /**
     * 키에 해당하는 값을 조회한다. 만약 키가 존재하지 않는다면 -1을 리턴한다.
     */
    public int get(int key) {
        int index = key % nodes.length;

        if (nodes[index] == null) {
            return -1;
        }

        Node valueNode = nodes[index];
        while (valueNode.nextNode != null) {
            valueNode = valueNode.nextNode;
        }

        return valueNode.val;

    }

    /**
     * 키에 해당하는 키, 값을 해시맵에 삭제한다.
     */
    public void remove(int key) {
        int index = key % nodes.length;

        if (nodes[index] != null) {
            nodes[index] = null;
        }
    }

}
