/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No21合并两个有序链表;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode l3=new ListNode(0);
    	ListNode l4=l3;
    	while(true){
			while(true){
				if(l1.val< l2.val) {
					l3.val = l1.val;
					if (l1.next != null) {
						l3.next = new ListNode(0);
						l3 = l3.next;
						l1 = l1.next;
					} else {
						l3.next = l2;
						return l4;
					}
				} else if (l1.val >= l2.val) {
					l3.val = l2.val;
					if (l2.next != null) {
						l3.next = new ListNode(0);
						l3 = l3.next;
						l2 = l2.next;
					} else {
						l3.next = l1;
						return l4;
					}
				}
			}
		}
	}
    
	public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
		ListNode head = null;
		if(l1==null&&l2!=null){
			head=l2;
            return head;
        }
        if(l2==null&&l1!=null){
        	head=l1;
            return head;
        }
        if(l1==null&&l2==null){
            return null;
        }
        if(l1.val>l2.val){
        	head=l2;
        	head.next=mergeTwoLists(l1, l2.next);
        	return head;
        }else{
        	head=l1;
        	head.next=mergeTwoLists(l1.next, l2);
        	return head;
        }

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
