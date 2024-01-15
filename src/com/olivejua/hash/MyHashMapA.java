package com.olivejua.hash;

public class MyHashMapA {

    public static void main(String[] args) {
        MyHashMapA hashMap = new MyHashMapA();
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
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node[] nodes = new Node[1_000_000];

    public MyHashMapA() {

    }

    /**
     * 키, 값을 해시맵에 삽입한다. 만약 이미 존재하는 키라면 업데이트한다.
     */
    public void put(int key, int value) {
        int index = key % nodes.length;

        if (nodes[index] == null) {
            nodes[index] = new Node(key, value);
            return;
        }

        Node node = nodes[index];
        while (node != null) {
            if (node.key == key) {
                node.val = value;
                break;
            }

            if (node.next == null) {
                break;
            }

            node = node.next;
        }

        node.next = new Node(key, value);
    }

    /**
     * 키에 해당하는 값을 조회한다. 만약 키가 존재하지 않는다면 -1을 리턴한다.
     */
    public int get(int key) {
        int index = key % nodes.length;

        if (nodes[index] == null) {
            return -1;
        }

        Node node = nodes[index];
        while (node != null) {
            if (node.key == key) {
                return node.val;
            }

            if (node.next == null) {
                break;
            }

            node = node.next;
        }

        return -1;

    }

    /**
     * 키에 해당하는 키, 값을 해시맵에 삭제한다.
     */
    public void remove(int key) {
        int index = key % nodes.length;

        if (nodes[index] == null) {
            return;
        }

        Node node = nodes[index];
        if (node != null) {
            if (node.key == key) {
                if (node.next != null) {
                    nodes[index] = node.next;
                } else {
                    nodes[index] = null;
                }
            }
        }

        Node prev = node;
        while (node != null) {
            if (node.key == key) {
                prev.next = node.next;
                return;
            }

            prev = node;
            node = node.next;
        }
    }

}
