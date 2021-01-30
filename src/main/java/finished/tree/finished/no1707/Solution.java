/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.tree.finished.no1707;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    TrieTree root = new TrieTree();

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 3, 4};
        int[][] queries = {{3, 1}, {1, 3}, {5, 6}};
        int[] ans = solution.maximizeXor(nums, queries);
        System.out.println("Arrays.toString(ans) = " + Arrays.toString(ans));
    }

    public int[] maximizeXor(int[] nums, int[][] queries) {
        Arrays.parallelSort(nums);
        int[] res = new int[queries.length];
        Integer[] idx = new Integer[queries.length];
        for (int i = 0; i < idx.length; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, Comparator.comparingInt(o -> queries[o][1]));
        int j = 0;
        for (int i = 0; i < queries.length; i++) {
            while (j < nums.length && nums[j] <= queries[idx[i]][1]) {
                root.insert(nums[j]);
                j++;
            }
            res[idx[i]] = j == 0 ? -1 : root.search(queries[idx[i]][0]);

        }
        return res;
    }

    class TrieNode {
        int val = -1;
        TrieNode left;
        TrieNode right;
    }

    class TrieTree {
        TrieNode root = new TrieNode();

        public void insert(int val) {
            TrieNode tmp = root;
            char[] chars = convert(val);
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '0') {
                    if (tmp.left == null) {
                        tmp.left = new TrieNode();
                    }
                    tmp = tmp.left;
                } else {
                    if (tmp.right == null) {
                        tmp.right = new TrieNode();
                    }
                    tmp = tmp.right;
                }
            }
            tmp.val = val;
        }

        public int search(int val) {
            TrieNode tmp = root;
            char[] chars = convert(val);
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '0') {
                    if (tmp.right != null) {
                        tmp = tmp.right;
                    } else {
                        tmp = tmp.left;
                    }
                } else {
                    if (tmp.left != null) {
                        tmp = tmp.left;
                    } else {
                        tmp = tmp.right;
                    }
                }
            }
            return tmp.val ^ val;
        }


        private char[] convert(int val) {
            String s = Integer.toBinaryString(val);
            String format = String.format("%32s", s);
            String s1 = format.replace(" ", "0");
            char[] chars = s1.toCharArray();
            return chars;
        }
    }
}
