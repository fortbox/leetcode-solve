/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0403;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<ListNode> nodeList = new ArrayList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
            nodeList.add(this.buildListNode(list));
        }
        return nodeList.toArray(new ListNode[0]);
    }

    private ListNode buildListNode(List<Integer> list) {
        ListNode head = null;
        ListNode res = null;
        for (Integer n : list) {
            if (head == null) {
                head = new ListNode(n);
                res = head;
                continue;
            }
            head.next = new ListNode(n);
            head = head.next;
        }
        return res;
    }
}