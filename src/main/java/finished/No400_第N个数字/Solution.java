/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No400_第N个数字;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int n=30;
		int nn=solution.findNthDigit(n);
		System.out.println("final answer is:"+nn);

	}
	
	public int findNthDigit(int n) {
		if (n<10) {
			return n;
		}
		//先判断数的位数，再来判断具体某位数
		int i=1;
		int j=9;
		int power=0;
		long sum=0;
		while(sum<n) {
			sum+=Math.pow(10, power)*i*j;
			power++;
			i++;
		}
		System.out.println("sum="+sum);
		power-=1;
		i-=1;
		System.out.println(Math.pow(10, (power))*(i)*j);
		int k=(int) (sum-Math.pow(10, (power))*(i)*j);
		System.out.println("i="+i+",power="+power);
		System.out.println("k="+k);
		System.out.println("n="+n);
		int sub=n-k;
		System.out.println("sub="+sub);
		int a=power;
		int b=i;
		int c=1;
		int d=(int) (Math.pow(10, a)*b);
		while(sub>d) {
			sub=sub-d;
			c++;
		}
		System.out.println("c="+c);
		int w=a;
		int t=1;
		while(w>0) {
			t=t*10;
			w--;
		}
		System.out.println("b="+b);
		System.out.println("t="+t);
		int f=sub/b;
		System.out.println("f="+f);
		int g=sub%b;
		System.out.println("g="+g);
		String s;
		if (g==0) {
			s=String.valueOf(f-1);
			s=s.substring(s.length()-1,s.length());
		}else {
			s=String.valueOf(c*t+f);
			System.out.println("s="+s);
			s=s.substring(g-1,g);
			
		}
		return Integer.valueOf(s).intValue();
		
	}

}
