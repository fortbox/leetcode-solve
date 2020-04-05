/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No160_相交链表;

public class Solution {
	/**
	 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
	 */
	/**
	 * 思路：先判断两个链表的长度，然后先遍历长的走多的节点，然后再两个结点一起走，发现相同的就返回。
	 * 
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		// 1,确定两个链表的长度
		ListNode a = headA;
		int headAlen = 0;
		while (a != null) {
			headAlen++;
			a = a.next;
		}
		ListNode b = headB;
		int headBlen = 0;
		while (b != null) {
			headBlen++;
			b = b.next;
		}
		// 2,长的先走一些步数
		int clen = headAlen - headBlen;
		if (clen>0) {
			while(clen>0) {
				headA=headA.next;
				clen--;
			}
		}else {
			clen=-clen;
			while(clen>0) {
				headB=headB.next;
				clen--;
			}
		}
		// 3,两个一起走，遇到相同的就返回。
		while(headA!=null) {
			if (headA==headB) {
				return headA;
			}
			headA=headA.next;
			headB=headB.next;
		}
		return null;
	}

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
