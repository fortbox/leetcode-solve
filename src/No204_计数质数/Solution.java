/**  
 * All rights Reserved, Designed By henryxiao
 * @Title:  Solution.java   
 * @Package No204_计数质数   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: henryxiao    
 * @date:   Apr 16, 2019 5:54:17 PM   
 * @version V1.0 
 * @Copyright: 2019 henryxiao. All rights reserved. 
 */
package No204_计数质数;

/**
 * @ClassName: Solution
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: henryxiao
 * @date: Apr 16, 2019 5:54:17 PM
 * 
 * @Copyright: 2019 henryxiao. All rights reserved.
 */
public class Solution {

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 * void @throws
	 * 
	 */
	public static void main(String[] args) {
		Solution solution = new Solution();
		int n = 1500000;
//		int n = 499979;
//		int n = 10;
		long startTime=System.currentTimeMillis();
		int num=solution.countPrimes(n);
		System.out.println(num);
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
	}

	/**
	 * 暴力求解
	 * @param n
	 * @return
	 */
	public int countPrimes(int n) {
		if(n<=2) {
			return 0;
		}
		int count=0;
		for(int i=2;i<n;i++) {
//			boolean flag=judgePrime(i);
			boolean flag1=judgePrime1(i);
			if(flag1) {
				count++;
			}
//			if(flag&&!flag1) {
//				System.out.println(i);
//			}
		}
		return count;
	}

	public boolean judgePrime1(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public boolean judgePrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
