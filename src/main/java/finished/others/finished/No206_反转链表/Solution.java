/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No206_反转链表;

import java.util.ArrayList;

public class Solution {

	/**
	 * 数组方式实现
	 *
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {

		ArrayList<ListNode> list = new ArrayList<ListNode>();
		while (head != null) {
			ListNode node = new ListNode(0);
			node.val = head.val;
			list.add(node);
			head = head.next;
		}

		for (ListNode listNode : list) {
			System.out.println(listNode.val);
		}
		System.out.println(list.size());
		if (list.size() == 0) {
			return null;
		}
		ListNode ln = new ListNode(0);
		ListNode cursor = ln;
		for (int i = list.size() - 1; i >= 0; i--) {

			ln.val = list.get(i).val;
			if (i - 1 >= 0) {
				ln.next = list.get(i - 1);
				ln = ln.next;
			} else {
				ln.next = null;
			}
		}
		return cursor;
	}

	/**
	 * 三个指针方式实现
	 *
	 * @param head
	 * @return
	 */
	public ListNode reverseList1(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode before = head;
		ListNode now = head.next;
		ListNode after = null;
		before.next = null;
		while (now.next != null) {
			System.out.println(now.val);
			after = now.next;
			now.next = before;
			before = now;
			now = after;
		}
		now.next = before;
		return now;
	}

	/**
	 * 递归方式实现
	 *
	 * @param head
	 * @return
	 */
	public ListNode reverseList2(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode newNode = reverseList2(head.next);

		ListNode n = newNode;
		while (newNode != null && newNode.next != null) {
			newNode = newNode.next;
		}
		newNode.next = head;
		head.next = null;
		return n;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

		public String toString(ListNode ln) {
			String s = String.valueOf(ln.val);
			return s;
		}
	}

}
