package com.olivejua.hash;

import static java.util.Objects.hash;

public class DesignHashMap {
    Node[] nodes;

    static final int MAX_CAPACITY = 10^6;

    static class Node {
        int key, val;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public DesignHashMap() {
        nodes = new Node[MAX_CAPACITY];
    }

    public void put(int key, int value) {
        int index = key % nodes.length;

        if (nodes[index] == null) {
            nodes[index] = new Node(key, value);
            return;
        }

        Node node = nodes[index];
        if (node.key == key) {
            nodes[index].val = value;
            return;
        }

        if (node.next != null) {
            Node newNode = new Node(key, value);

            Node prev = node;
            node = node.next;
            while (node != null) {
                if (node.key == key) {
                    node.val = value;
                }

                Node temp = node;
                prev = node;
                node = temp.next;
            }

            prev.next = newNode;
        } else {
            nodes[index].next = new Node(key, value);
        }
    }

    public int get(int key) {
        int index = key % nodes.length;

        if (nodes[index] == null) {
            return -1;
        }

        Node node = nodes[index];
        if (node.key == key) {
            return node.val;
        }

        node = node.next;
        while (node != null) {
            if (node.key == key) {
                return node.val;
            }

            node = node.next;
        }

        return -1;
    }

    public void remove(int key) {
        int index = key % nodes.length;

        if (nodes[index] == null) {
            return;
        }

        Node node = nodes[index];
        if (node.key == key) {
            nodes[index] = node.next;
            return;
        }

        Node prev = node;
        node = node.next;
        while (node != null) {
            if (node.key == key) {
                prev.next = node.next;
            }

            Node temp = node;
            prev = node;
            node = temp.next;
        }
    }
}
