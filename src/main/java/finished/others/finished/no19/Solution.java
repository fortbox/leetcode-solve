/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no19;


class Solution {
    public static void main(String[] args) {
        String s = "中国";
        System.out.println("s = " + s.length());
        char[] array = s.toCharArray();
        System.out.println("array = " + array);
        for (char c : array) {
            System.out.println("c = " + c);
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = head;
        ListNode root1 = head;
        int len = 0;
        while (root1 != null) {
            len++;
            root1 = root1.next;
        }
        if (n == len) {
            return head.next;
        }
        System.out.println("len = " + len);
        int index = 1;
        while (root != null && index < len - n + 1) {
            root = root.next;
            index++;
        }
        ListNode n1 = root;
        ListNode n3 = root.next.next;
        n1.next = n3;
        return head;
    }


    //    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
