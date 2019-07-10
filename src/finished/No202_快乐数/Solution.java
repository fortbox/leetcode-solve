package finished.No202_快乐数;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		int n=2;
		Solution solution = new Solution();
		boolean b=solution.isHappy(n);
		System.out.println(b);

	}
	/**
	 * 用递归实现
	 * 1，把int拆为个位数
	 * 2，然后调用相加
	 * 3，如果为小于10则判断是否位1，如果为1则返回true，否则返回false；
	 * 4,如果超出最大值，则返回false；
	 * 
	 * @param n
	 * @return
	 */
	Set<String> set=new HashSet<String>();
	public boolean isHappy(int n) {
			if (n==1) {
				return true;
			}
			if (set.contains(String.valueOf(n))) {
				return false;
			}
		set.add(String.valueOf(n));
		int[] a=split(n);
		int b=add(a);
		System.out.println(b);
		return isHappy(b);
	}
	
	public int[] split(int n) {
		StringBuilder sb=new StringBuilder();
		while(n>0) {
			int m=n%10;
			n=n/10;
			sb.append(m);
		}
		System.out.println(sb.toString());
		String s=sb.toString();
		int[] a=new int[s.length()];
		for (int i = 0; i < a.length; i++) {
			a[i]=Integer.parseInt(String.valueOf(s.charAt(i)));;
			System.out.println("a[i]="+a[i]);
		}
		return a;
	}
	
	public int add(int[] a) {
		int c=0;
		for (int i = 0; i < a.length; i++) {
			c=(int) (c+Math.pow(a[i], 2));
		}
		return c;
	}

}
