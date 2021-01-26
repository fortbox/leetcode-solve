/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package no1032;

public class StreamChecker {
    private final TrieNode root;
    StringBuilder stringBuilder = new StringBuilder();
    int maxLength = 0;

    public StreamChecker(String[] words) {
        /**
         * 倒序插入
         */
        root = new TrieNode();
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
            insert(new StringBuilder(word).reverse().toString());
        }
    }

    public boolean query(char letter) {
        stringBuilder.insert(0, letter);
        if (stringBuilder.length() > maxLength) stringBuilder.deleteCharAt(stringBuilder.length());
        System.out.println("stringBuilder.toString() = " + stringBuilder.toString());

        TrieNode temp = root;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (temp.next[stringBuilder.charAt(i) - 'a'] == null) return false;
            temp = temp.next[stringBuilder.charAt(i) - 'a'];
        }
        return temp.isLeaf;
    }

    public void insert(String word) {
        if (word == null || word.length() == 0) return;
        TrieNode node = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            TrieNode tmp = node.next[c - 'a'];
            if (tmp == null) {
                tmp = new TrieNode();
                node.next[c - 'a'] = tmp;
            }
            node = node.next[c - 'a'];
        }
        node.isLeaf = true;
    }

    public class TrieNode {
        boolean isLeaf;
        TrieNode[] next;

        public TrieNode() {
            next = new TrieNode[26];
        }
    }


}