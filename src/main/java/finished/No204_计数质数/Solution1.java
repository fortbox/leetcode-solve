/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No204_计数质数;

public class Solution1 {

	public static void main(String[] args) {
		Solution1 solution = new Solution1();
//		int n = 1500000;
		int n = 499979;
//		int n = 10;
		long startTime=System.currentTimeMillis();
		int num=solution.countPrimes(n);
		System.out.println(num);
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
	}

	/**
	 * 见埃拉托色尼筛法 从前往后，排除法
	 * 
	 * @param n
	 * @return
	 */
	public int countPrimes(int n) {
		int count=0;
		if (n <= 1) {
			return count;
		}
		boolean [] a =new boolean[n];
		a[0]=false;
		a[1]=false;
		for(int i=2;i<n;i++) {
			a[i]=true;
		}
		for(int i=2;i<n;i++) {
			if(a[i]) {
				for(int j=2;j*i<n;j++) {
					a[i*j]=false;
//					System.out.println(i*j);
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]) {
				count++;
			}
		}
		return count;

	}

}
