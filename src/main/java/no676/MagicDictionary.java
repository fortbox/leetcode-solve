package no676;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MagicDictionary {
    TrieTree trieTree;

    /**
     * Initialize your data structure here.
     */
    public MagicDictionary() {
        trieTree = new TrieTree();
    }

    /**
     * Build a dictionary through a list of words
     */
    public void buildDict(String[] dict) {
        Arrays.stream(dict).forEach(s -> trieTree.insert(s));
    }

    /**
     * Returns if there is any word in the trie that equals to the given word after modifying exactly one character
     */
    public boolean search(String word) {
        int length = word.length();
        for (int i = 0; i < length; i++) {
            StringBuilder builder = new StringBuilder(word);
            for (int j = 0; j < 26; j++) {
                builder.setCharAt(i, (char) (j + 'a'));
                String tmp = builder.toString();
                if (!tmp.equals(word) && trieTree.search(tmp)) return true;
            }
        }
        return false;
    }

    class TrieTree {
        private TrieNode root;

        public TrieTree() {
            root = new TrieNode();
        }

        public void insert(String word) {
            if (word == null || word.length() == 0) return;
            TrieNode node = root;
            int len = word.length();
            for (int i = 0; i < len; i++) {
                char c = word.charAt(i);
                TrieNode tmp = node.next.get(c);
                if (tmp == null) {
                    tmp = new TrieNode();
                    node.next.put(c, tmp);
                }
                node = node.next.get(c);
            }
            node.isLeaf = true;
            node.word = word;
        }

        public boolean search(String word) {
            if (word == null || word.length() == 0) return false;
            TrieNode node = root;
            int len = word.length();
            for (int i = 0; i < len; i++) {
                char c = word.charAt(i);
                TrieNode tmp = node.next.get(c);
                if (tmp == null) return false;
                node = node.next.get(c);
            }
            return node.isLeaf;
        }
    }

    class TrieNode {
        boolean isLeaf;
        Map<Character, TrieNode> next;
        String word;

        public TrieNode() {
            next = new HashMap<>();
        }
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */