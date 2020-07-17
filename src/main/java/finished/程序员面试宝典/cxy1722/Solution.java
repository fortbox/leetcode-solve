/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1722;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        String beginWord="hit";
        String endWord="cog";
        List<String> wordList=new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
        Solution solution = new Solution();
        List<String> ladders = solution.findLadders(beginWord, endWord, wordList);
        System.out.println(ladders);
    }
    private Tree root;
    List<String> res = new ArrayList<>();

    public List<String> findLadders(String beginWord, String endWord, List<String> wordList) {
        wordList.add(beginWord);
        if (!wordList.contains(endWord)) return res;
        //构建一棵树
        HashSet<String> isVisited = new HashSet<>();
        root = new Tree(endWord);
        isVisited.add(endWord);
        buildTree(wordList, isVisited);
        dfs(beginWord, root, new ArrayList<>());
        Collections.reverse(res);
        return res;
    }

    private void dfs(String s, Tree root, ArrayList<String> list) {
        if (root == null) return;
        list.add(root.val);
        if (root.val.equals(s)) {
            res = list;
            return;
        }
        for (Tree child : root.children) {
            ArrayList<String> list1 = new ArrayList<>(list);
            dfs(s, child, list1);
        }
    }

    private void buildTree(List<String> wordList, HashSet<String> isVisited) {
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Tree tmp = queue.poll();
                for (String s : wordList) {
                    if (!isVisited.contains(s) && isConnected(tmp.val, s)) {
                        Tree tree = new Tree(s);
                        isVisited.add(s);
                        tmp.children.add(tree);
                        queue.add(tree);
                    }
                }
            }
        }
    }

    private boolean isConnected(String str1, String str2) {
        int dif = 0;
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length() && dif <= 1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                dif++;
            }
        }
        return dif == 1;
    }

    class Tree {
        String val;
        List<Tree> children;

        public Tree(String val) {
            this.val = val;
            children = new ArrayList<>();
        }
    }
}
