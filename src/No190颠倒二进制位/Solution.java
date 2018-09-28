package No190颠倒二进制位;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {

		int n = 1;
		Solution solution = new Solution();
		int k = solution.reverseBits(n);
		System.out.println(k);
	}

	/**
	 * 二进制入堆栈，然后出栈，保留二进制
	 * 
	 * @param n
	 * @return
	 */
	public int reverseBits(int n) {
		// 1.int转二进制
		StringBuilder sb1 = new StringBuilder();
		for (int i = 31; i >= 0; i--) {
			sb1.append(n >>> i & 1);
		}
		System.out.println(sb1.toString());
		String s = sb1.toString();
		// 2.入栈
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		int b = 0;
		int factor = 2;
		int i = 0;
		while (!stack.isEmpty()) {
			factor = (int) Math.pow(factor, i);
			b = b + (int) stack.pop() * factor;
			i = 2;
			System.out.println(b);
		}

		System.out.println(b);
		return b;

	}

}
