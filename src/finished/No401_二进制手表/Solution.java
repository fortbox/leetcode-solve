package finished.No401_二进制手表;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int num = 7;
		List<String> list = solution.readBinaryWatch_1(num);
		List<String> list1 = solution.readBinaryWatch_2(num);
//		for (String string : list) {
//			System.out.println(string);
//		}
		System.out.println("list="+list.toString());
		System.out.println("list1="+list1.toString());

	}

	/**
	 * 解法一：暴力轮询
	 * 
	 * @param num
	 * @return
	 */
	public List<String> readBinaryWatch_1(int num) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 12; i++) {
//			System.out.println(Integer.toBinaryString(i<<6));
			for (int j = 0; j < 60; j++) {
				if (Integer.bitCount((i << 6) + j) == num) {
//					System.out.println(Integer.bitCount(i << 6) + ",i=" + i);
//					System.out.println(Integer.bitCount(j) + ",j=" + j);
//					System.out.println(Integer.bitCount(i << 6 + j));
					list.add(String.format("%d:%02d", i, j));
				}
			}
		}
		return list;
	}

	/**
	 * 解法二：动态规划
	 * 
	 * @param num
	 * @return
	 */
	public List<String> readBinaryWatch_2(int num) {
		List<String> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i <= 4&i<=num; i++) {
			int j = num - i;
			System.out.println("readBinaryWatch_2,i="+i+",j="+j);
			if (j<=6) {
				list1 = findLED(4, i);
				list2 = findLED(6, j);
				System.out.println("list1="+list1);
				System.out.println("list2="+list2);
				for (Integer h : list1) {
					for (Integer m : list2) {
						if (h < 12 & m < 60) {
							String s = String.format("%d:%02d", h, m);
							list.add(s);
						}
					}
				}
			}
		}
		return list;
	}

	private List<Integer> findLED(int totalLED, int lighted) {
		List<Integer> list = new ArrayList<>();
		if (totalLED == lighted) {
			int i = 0;
			for (int j = 0; j < lighted; j++) {
				i = i + (1 << j);
				System.out.println("(i<<j)="+(1<<j)+",i="+i);
			}
			System.out.println("i="+i+",totalLED="+totalLED+",lighted="+lighted);
			list.add(i);
			return list;
		} else if (totalLED > lighted) {
			if (lighted >= 1) {
				List<Integer> list1 = findLED(totalLED - 1, lighted - 1);
				int i = 1;
				i = i << (totalLED - 1);
				for (Integer integer : list1) {
					integer = i + integer.intValue();
					list.add(integer);
				}
			}
			list.addAll(findLED(totalLED - 1, lighted));
			return list;
		}
		return null;
	}
}
