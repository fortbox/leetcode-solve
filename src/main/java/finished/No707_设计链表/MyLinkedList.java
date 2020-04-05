/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No707_设计链表;

class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    /** Initialize your data structure here. */
    ListNode head = null;
    public MyLinkedList() {
        head = new ListNode(0);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode cur = head.next;
        int num = -1;
        while(cur != null) {
            num ++;
            if(num == index) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head.next;
        head.next = node;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index<0) index=0;
        ListNode cur = head;
        int num = -1;
        while(cur != null) {
            num ++;
            if(num == index ) {
                ListNode node = new ListNode(val);
                node.next = cur.next;
                cur.next = node;
            }
            cur = cur.next;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

        ListNode cur = head;
        int num = -1;
        while(cur.next != null) {
            num ++;
            if(num == index ) {
                ListNode temp = cur.next;
                cur.next = temp.next;
                break;
            }
            cur = cur.next;
        }
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */