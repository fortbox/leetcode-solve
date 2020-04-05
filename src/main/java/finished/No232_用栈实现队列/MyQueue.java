/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No232_用栈实现队列;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> stack;
	 /** Initialize your data structure here. */
    public MyQueue() {
        stack=new Stack<>();
    }
    
    /**
     * 只需要在每次入栈时更改下顺序就行了。
     */
    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> stacknew=new Stack<>();
        if (stack.isEmpty()) {
			stack.push(x);
		}else {
        while(!stack.isEmpty()) {
        	stacknew.push(stack.peek());
        	stack.pop();
        }
        stacknew.push(x);
        while(!stacknew.isEmpty()) {
        	stack.push(stacknew.peek());
        	stacknew.pop();
        }
		}
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

