package com.olivejua.trie;

import java.util.Arrays;

public class ImplementTrie implements Trie {
    private TrieNode root;

    public ImplementTrie() {
        root = new TrieNode();
    }

    @Override
    public void insert(String word) {
        if (word == null || word.isBlank()) {
            return;
        }

        char[] letters = word.toCharArray();
        int index = 0;
        TrieNode[] nodes = this.root.children;
        while (index < letters.length) {
            if (nodes[letters[index] - 'a'] == null) {
                nodes[letters[index] - 'a'] = new TrieNode();
            }

            if (index == letters.length-1) {
                nodes[letters[index] - 'a'].isLast = true;
            }

            nodes = nodes[letters[index] - 'a'].children;
            index++;
        }
    }

    @Override
    public boolean search(String word) {
        char[] letters = word.toCharArray();
        int index = 0;
        TrieNode[] nodes = this.root.children;
        while (index < letters.length) {
            TrieNode node = nodes[letters[index] - 'a'];
            if (node == null) {
                return false;
            }

            if (index == letters.length-1) {
                return node.isLast;
            }

            nodes = node.children;
            index++;
        }

        return false;
    }

    @Override
    public boolean startsWith(String prefix) {
        char[] letters = prefix.toCharArray();
        int index = 0;
        TrieNode[] nodes = this.root.children;
        while (index < letters.length) {
            TrieNode node = nodes[letters[index] - 'a'];
            if (node == null) {
                return false;
            }

            nodes = node.children;
            index++;
        }

        return true;
    }

    private static class TrieNode {
        TrieNode[] children;
        boolean isLast;

        public TrieNode() {
            children = new TrieNode['z' - 'a' + 1];
            isLast = false;
        }
    }
}
