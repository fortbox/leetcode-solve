/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0204;


import java.util.ArrayList;

class Solution {
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        list.sort(Integer::compareTo);
        int index = 0;
        ListNode node = null;
        ListNode res = null;
        for (int i = 0; i < list.size(); i++) {
            if (node == null) {
                node = new ListNode(list.get(i));
                res = node;
                continue;
            }
            ListNode tmp = new ListNode(list.get(i));
            node.next = tmp;
            node = node.next;
        }
        return res;
    }

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
