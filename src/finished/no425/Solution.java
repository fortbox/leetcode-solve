/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no425;

import java.util.*;

class Solution {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> res = new ArrayList<>();
        if (words == null || words.length == 0) return res;
        int len = words[0].length();
        List<String> temp = new ArrayList<>();
        Trie trie = new Trie(words);
        for (String word: words) {
            temp.add(word);
            dfs(trie, len, temp, res);
            temp.remove(temp.size()-1);
        }
        return res;
    }

    /**
     * 这个dfs就比较牛逼了。这道题必须要收藏一下了
     * @param trie
     * @param len
     * @param temp
     * @param res
     */
    private void dfs(Trie trie, int len, List<String> temp, List<List<String>> res) {
        int size = temp.size();
        if (size == len) {
            res.add(new ArrayList<>(temp));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str: temp) {
            sb.append(str.charAt(size));
        }
        String prefix = sb.toString();
        List<String> words = trie.getWords(prefix);
        for (String word: words) {
            temp.add(word);
            dfs(trie, len, temp, res);
            temp.remove(temp.size()-1);
        }
    }
}

class Trie {
    TrieNode root;
    public Trie(String[] strs) {
        root = new TrieNode();
        for (String str: strs) {
            TrieNode cur = root;
            for (char ch: str.toCharArray()) {
                int index = ch-'a';
                if (cur.children[index] == null) cur.children[index] = new TrieNode();
                cur.children[index].words.add(str);
                cur = cur.children[index];
            }
        }
    }

    public List<String> getWords(String prefix) {
        List<String> res = new ArrayList<>();
        TrieNode cur = root;
        for (char ch: prefix.toCharArray()) {
            int index = ch-'a';
            if (cur.children[index] == null) return res;
            cur = cur.children[index];
        }
        res.addAll(cur.words);
        return res;
    }
}

class TrieNode {
    TrieNode[] children;
    List<String> words;
    public TrieNode() {
        children = new TrieNode[26];
        words = new ArrayList<>();
    }
}
