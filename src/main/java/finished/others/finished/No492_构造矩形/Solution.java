/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

/**
 *
 */
package finished.others.finished.No492_构造矩形;

/**
 * @author Henry Xiao
 * @date 2019年6月30日
 */
public class Solution {

	public static void main(String[] args) {

		int area = 4;
		int[] ns = constructRectangle(area);
		for (int i : ns) {
			System.out.println(i);
		}
	}


	public static int[] constructRectangle(int area) {
		//1，遍历，记录常和宽，比较差距
		int diff = Integer.MAX_VALUE;
		int w = 0;
		int l = 0;
		int[] ns = new int[2];
		for (int i = 1; i <= (int) Math.sqrt(area); i++) {
			if (area % i == 0) {
				w = i;
				l = area / i;
				if (diff > (l - w)) {
					ns[0] = l;
					ns[1] = w;
					diff = l - w;
				}
			}
		}
		return ns;
	}
}
