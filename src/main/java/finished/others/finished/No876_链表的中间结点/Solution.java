/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No876_链表的中间结点;


class Solution {
    public ListNode middleNode(ListNode head) {
        //1. Calculate the length
        int len = 0;
        ListNode ln = head;
        while (head != null) {
            len++;
            head = head.next;
        }

        //2. Calculate the coordinates in the middle

        int middle = len / 2;
        //3. Traverse to find the middle
        int n = 0;
        while (n < middle) {
            ln = ln.next;
            n++;
        }

        return ln;
    }


    //   Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
