package finished.No234_回文链表;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	/**
	 * 判断是否是回文链表<br/>
	 * 思路：<br/>
	 * 1，链表反转<br/>
	 * （注意：只能反转一半的链表） 2，链表对比<br/>
	 * 
	 * {@docRoot 反转链表是在原来的地址上反转的}
	 * 
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(ListNode head) {
		ListNode l = head;
		while (l != null) {
			System.out.println("l.val: " + l.val);
			l = l.next;
		}
		// 1，链表反转
		// 1.1 找到中间node
		ListNode middleNode=findMiddleNode(head);
		ListNode r = reverseListNode(middleNode);
		ListNode kk = head;
		while (kk != null) {
			System.out.println("kk.val: " + kk.val);
			kk = kk.next;
		}

		ListNode k = head;
		while (k != null) {
			System.out.println("k.val: " + k.val);
			k = k.next;
		}
		// 2，遍历对比
		while (head != null && r != null) {
			if (head.val != r.val) {
				return false;
			}
			head = head.next;
			r = r.next;
		}
		return true;
	}

	private ListNode reverseListNode(ListNode head) {
		if (head == null) {
			return head;
		}
		if (head.next == null) {
			return head;
		}
		ListNode before = head;
		ListNode now = head.next;
		before.next = null;
		ListNode after;

		while (now.next != null) {
			after = now.next;
			now.next = before;
			before = now;
			now = after;
		}
		now.next = before;
		ListNode l = now;
		while (l != null) {
			System.out.println("l.val: " + l.val);
			l = l.next;
		}
		return now;
	}

	private ListNode findMiddleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		int i=0;
		while (fast!=null&&fast.next != null) {
			System.out.println("第"+i+"次进入！");
			if(fast!=null) System.out.println("fast="+fast.val);
			if(slow!=null) System.out.println("slow="+slow.val);
			fast = fast.next;
			if(fast!=null) System.out.println("fast="+fast.val);
			slow = slow.next;
			if(slow!=null) System.out.println("slow="+slow.val);
			if (fast == null) {
				break;
			}
			fast = fast.next;
			if(fast!=null) System.out.println("fast="+fast.val);
			i++;
		}
		if(slow!=null) System.out.println("end slow="+slow.val);
		return slow;

	}

}
