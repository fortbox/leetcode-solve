/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no987;


import java.util.*;

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        /**
         * 前序遍历一下，给各个节点打上坐标。
         */
        Queue<Axis> queue = new LinkedList<>();
        queue.add(new Axis(root, 0, 0));
        List<Coordinate> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Axis poll = queue.poll();
                list.add(new Coordinate(poll.x, poll.y, poll.node.val));
                if (poll.node.left != null) {
                    queue.add(new Axis(poll.node.left, poll.x - 1, poll.y - 1));
                }
                if (poll.node.right != null) {
                    queue.add(new Axis(poll.node.right, poll.x + 1, poll.y - 1));
                }
            }
        }
        list.sort(Coordinate::compareTo);
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (Coordinate coordinate : list) {
            int val = coordinate.value;
            int x = coordinate.x;
            List<Integer> tmp = map.getOrDefault(x, new ArrayList<>());
            tmp.add(val);
            map.put(x, tmp);
        }
        List<List<Integer>> res = new ArrayList<>();
        map.forEach((k, v) -> res.add(v));
        return res;
    }

    class Coordinate implements Comparable<Coordinate> {
        int x;
        int y;
        int value;

        public Coordinate(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }

        @Override
        public int compareTo(Coordinate that) {
            if (this.x != that.x)
                return Integer.compare(this.x, that.x);
            else if (this.y != that.y)
                return Integer.compare(this.y, that.y);
            else
                return Integer.compare(this.value, that.value);
        }
    }


    class Axis {
        TreeNode node;
        int x;
        int y;

        public Axis(TreeNode node, int x, int y) {
            this.node = node;
            this.x = x;
            this.y = y;
        }
    }


    //      Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}