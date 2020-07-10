package cxy1717;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        String big="mississippi";
        String[] smalls={"is","ppi","hi","sis","i","ssippi"};
        Solution solution = new Solution();
        int[][] ans = solution.multiSearch(big, smalls);
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }
    }
    private TrieTree root = new TrieTree();

    public int[][] multiSearch(String big, String[] smalls) {
        /**
         * 只想到了暴力解法，需要n**m
         */
        /**
         * 看了其他人解答，可以用前缀树
         */
        for (String small : smalls) {
            root.insert(small);
        }
        HashMap<String, List<Integer>> map = new HashMap<>();
        char[] array = big.toCharArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <= array.length; j++) {
                String tmp = big.substring(i, j);
                if (root.search(tmp)) {
                    map.computeIfAbsent(tmp, k->new ArrayList<>()).add(i);
                }
            }
        }
        int[][] res = new int[smalls.length][];
        for (int i = 0; i < res.length; i++) {
            String s = smalls[i];
            List<Integer> list = map.get(s);
            if (list == null || list.size() == 0) {
                res[i] = new int[]{};
            } else {
                res[i] = list.stream().mapToInt(value -> value).toArray();
            }
        }
        return res;
    }
    public class TrieNode {
        boolean isLeaf;
        TrieNode[] next;
        String word;

        public TrieNode() {
            next=new TrieNode[26];
        }
    }
    public class TrieTree {
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
                TrieNode tmp = node.next[c-'a'];
                if (tmp == null) {
                    tmp = new TrieNode();
                    node.next[c-'a']=tmp;
                }
                node = node.next[c-'a'];
            }
            node.isLeaf = true;
            node.word=word;
        }

        public boolean search(String word) {
            if (word == null || word.length() == 0) return false;
            TrieNode node = root;
            int len = word.length();
            for (int i = 0; i < len; i++) {
                char c = word.charAt(i);
                TrieNode tmp = node.next[c-'a'];
                if (tmp == null) return false;
                node = node.next[c-'a'];
            }
            return node.isLeaf;
        }
    }
}