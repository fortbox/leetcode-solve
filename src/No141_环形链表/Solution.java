package No141_环形链表;

import java.util.HashSet;
import java.util.Set;

import common.ListNode;

public class Solution {
	public static void main(String[] args) {
		
		ListNode ln=new ListNode(1, null);
		
		System.out.println(hasCycle(ln));
	}
	

	
	/**
	 * 判断是不是有环
	 * 思考：就是判断next指向是否有重复的。对于这种判断我比较喜欢用set来判断。
	 * @param head
	 * @return
	 */
	public static boolean hasCycle(ListNode head){
		if (head==null) {
			return false;
		}
		//插入hashset，并做判断，hashset的值和类地址的hashcode一一对应。
		Set<ListNode> set=new HashSet<>();
		while(head.next!=null){
			if (set.contains(head)) {
				return true;
			}else{
				set.add(head);
			}
			head=head.next;
		}
		return false;
	}

}
