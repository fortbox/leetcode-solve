/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No237_删除链表中的节点;

public class Solution {

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
