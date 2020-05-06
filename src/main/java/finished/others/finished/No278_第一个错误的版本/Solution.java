/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No278_第一个错误的版本;

public class Solution extends VersionControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 二分查找
	 *
	 * @param n
	 * @return
	 */
	public int firstBadVersion(int n) {
		return firstBad(1, n);
	}

	public int firstBad(int from, int to) {
		if (to - from <= 1) {
			return isBadVersion(from) ? from : to;
		}
//		long kk = ((long)to + (long)from) / 2;
//		int k=Long.valueOf(kk).intValue();

		int k = from + (to - from) / 2;
		System.out.println("from:" + from + ",to:" + to + ",k:" + k);
		if (isBadVersion(k)) {
			return firstBad(from, k);
		} else {
			return firstBad(k, to);
		}
	}

}
