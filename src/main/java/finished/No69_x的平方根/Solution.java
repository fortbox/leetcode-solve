/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No69_x的平方根;

public class Solution {

	public static void main(String[] args) {
		int a=5;
		System.out.println(mySqrt1(a));

	}
	/**
	 * 直接利用平方函数的图形性质
	 * @param x
	 * @return
	 */
    public int mySqrt(int x) {
        for (int i = 1; i <=x/2; i++) {
			if (Math.pow(i, 2)>x) {
				return i-1;
			}
		}
        return x/2;
    }
    
    /**
     * 直接调用Math函数
     * @param x
     * @return
     */
    public  static int mySqrt1(int x) {
       return (int)Math.sqrt(x);
    }
}
