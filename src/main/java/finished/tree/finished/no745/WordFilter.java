/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no745;

import java.util.*;

/**
 * 两个前缀树，记录list和权重
 */
class WordFilter {
    TrieTree prefix = new TrieTree();
    TrieTree suffix = new TrieTree();

    public WordFilter(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = words.length - 1; i >= 0; i--) {
            map.putIfAbsent(words[i], i);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            prefix.insert(entry.getKey(), entry.getValue());
            suffix.insert(new StringBuilder(entry.getKey()).reverse().toString(), entry.getValue());
        }
    }

    public int f(String prefix, String suffix) {
        List<BeanNode> prefixFix = this.prefix.findFix(prefix);
        List<BeanNode> suffixFix = this.suffix.findFix(new StringBuilder(suffix).reverse().toString());
        int maxWeight = -1;
        for (BeanNode beanNode : prefixFix) {
            System.out.println("beanNode.weight = " + beanNode.weight);
            System.out.println("beanNode.word = " + beanNode.word);
            suffixFix.forEach(beanNode1 -> System.out.println(beanNode1.weight + "," + beanNode1.word));
            if (suffixFix.contains(beanNode)) {
                maxWeight = Math.max(maxWeight, beanNode.weight);
            }
        }
        return maxWeight;
    }

    public class BeanNode {
        String word;
        int weight;

        public BeanNode(String word, int weight) {
            this.word = word;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BeanNode beanNode = (BeanNode) o;
            return weight == beanNode.weight && Objects.equals(new StringBuilder(word).reverse().toString(), beanNode.word);
        }

        @Override
        public int hashCode() {
            return Objects.hash(word, weight);
        }
    }

    public class TrieNode {
        boolean isLeaf;
        Map<Character, TrieNode> next;
        List<BeanNode> words;

        public TrieNode() {
            next = new HashMap<>();
            words = new ArrayList<>();
        }

    }

    public class TrieTree {
        private TrieNode root;

        public TrieTree() {
            root = new TrieNode();
        }

        public void insert(String word, int weight) {
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
                node.words.add(new BeanNode(word, weight));
                node = node.next.get(c);
            }
            node.isLeaf = true;
            node.words.add(new BeanNode(word, weight));
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

        public List<BeanNode> findFix(String word) {
            if (word == null || word.length() == 0) return new ArrayList<>();
            TrieNode node = root;
            int len = word.length();
            for (int i = 0; i < len; i++) {
                char c = word.charAt(i);
                TrieNode tmp = node.next.get(c);
                if (tmp == null) return new ArrayList<>();
                ;
                node = node.next.get(c);
            }
            return node.words;
        }
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */