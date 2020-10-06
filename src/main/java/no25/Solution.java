/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no25;

import tool.ListNode;

class Solution {
    /**
     * 翻转的时候注意顺序，尤其是原地翻转
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        int count = 0;
        ListNode end = head;
        while (end != null) {
            count += 1;
            if (count % k != 0) {
                end = end.next;
                continue;
            }
            pre = reverseListNode(pre, end.next);
            end = pre.next;
        }
        return fakeHead.next;
    }

    /**
     * 翻转的时候注意顺序，尤其是原地翻转
     *
     * @param pre
     * @param node
     * @return
     */
    private ListNode reverseListNode(ListNode pre, ListNode node) {
        ListNode last = pre.next;
        ListNode cur = last.next;
        while (cur != node) {
            ListNode temp = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            last.next = temp;
            cur = temp;
        }
        return last;
    }
}