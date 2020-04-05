/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No83_删除排序链表中的重复元素;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	/**
	 * 本来就是有序数组，不用定义set
	 * 定义一个node，来去除重复。同时记录上一个node
	 * 
	 * @param head
	 * @return
	 */
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode a = head;
		ListNode b = head.next;
		ListNode c = a;
		while (b != null) {
			if (a.val == b.val) {
				b = b.next;
				a.next = b;
			} else {
				a = a.next;
				b = b.next;
			}
		}
		return c;
	}

	/**
	 * 定义一个set，来去除重复。同时记录上一个node
	 * 这个方法普遍些。
	 * 
	 * @param head
	 * @return
	 */
	public ListNode deleteDuplicates1(ListNode head) {
		if (head == null) {
			return head;
		}
		Set<String> set = new HashSet<>();
		ListNode a = head;
		ListNode b = head.next;
		ListNode c = a;
		set.add(String.valueOf(a.val));
		String s = "";
		while (b != null) {
			s = String.valueOf(b.val);
			if (set.contains(s)) {
				b = b.next;
				a.next = b;
			} else {
				set.add(s);
				a = a.next;
				b = b.next;
			}
		}
		return c;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
