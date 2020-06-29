/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0205;

import java.math.BigDecimal;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder builder = new StringBuilder();
        while (l1 != null) {
            builder.append(l1.val);
            l1 = l1.next;
        }
        BigDecimal a = new BigDecimal(builder.reverse().toString());
        StringBuilder builder1 = new StringBuilder();
        while (l2 != null) {
            builder1.append(l2.val);
            l2 = l2.next;
        }
        BigDecimal b = new BigDecimal(builder1.reverse().toString());
        String s = String.valueOf(b.add(a).toPlainString());
        ListNode res = null;
        ListNode head = null;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (head == null) {
                head = new ListNode(s.charAt(i) - '0');
                res = head;
                continue;
            }
            ListNode tmp = new ListNode(s.charAt(i) - '0');
            head.next = tmp;
            head = head.next;
        }
        return res;
    }
}