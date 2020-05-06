/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No203_移除链表元素;

public class Solution {

	public static void main(String[] args) {

	}

	public ListNode removeElements(ListNode head, int val) {
		// 判断头
		if (head == null) {
			return null;
		}
		while (head != null && head.val == val) {
			head = head.next;
		}
		if (head == null) {
			return null;
		}
		// 如果元素不是头
		ListNode ln = head;
		ListNode headln = ln;
		while (ln != null && ln.next != null) {
			if (ln.next.val == val) {
				if (ln.next.next != null) {
					ln.next = ln.next.next;
				} else {
					ln.next = null;
				}
			} else {
				ln = ln.next;
			}
		}
		return headln;

	}

	// 不是头
	public ListNode delete(ListNode ln, int val) {
		ListNode head = ln;
		while (ln.next != null) {
			if (ln.next.val == val) {
				ln.next = ln.next.next;
			}
		}
		return head;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
