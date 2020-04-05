/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No15_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionMe {

	public static void main(String[] args) {
		int[] nums = {-3,1,-5,2,-4,2,-1,1,-5,-1,4};
		long startTime = System.currentTimeMillis();
		System.out.println(threeSum(nums));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		Set<String> set = new HashSet<>();
		List<List<Integer>> list = new ArrayList<>();
		int j = 0;
		int k = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			j = i + 1;
			k = nums.length - 1;
			System.out.println("i="+nums[i]);
			while (nums[i] + nums[j] + nums[k] > 0) {
				if (k - j > 1) {
					k--;
				} else {
					break;
				}
			}
			while (nums[i] + nums[j] + nums[k] < 0) {
				if (k - j > 1) {
					j++;
				} else {
					break;
				}
			}
			while (nums[i] + nums[j] + nums[k] > 0) {
				if (k - j > 1) {
					k--;
				} else {
					break;
				}
			}
			while (nums[i] + nums[j] + nums[k] < 0) {
				if (k - j > 1) {
					j++;
				} else {
					break;
				}
			}
			if (nums[i] + nums[j] + nums[k] == 0) {
				savelist(nums[i], nums[j], nums[k], set, list);
				int m = j;
				while (m < k) {
					if (nums[i] + nums[m] + nums[k] == 0) {
						savelist(nums[i], nums[m], nums[k], set, list);
						m = m + 1;
					}
					if (nums[i] + nums[m] + nums[k] < 0 && m < k) {
						m = m + 1;
					}
					if (nums[i] + nums[m] + nums[k] > 0 && m < k) {
						k = k - 1;
					}
				}
			}
		}
		return list;
	}

	private static void savelist(int a, int b, int c, Set<String> set, List<List<Integer>> list) {
		String key = "" + a + b + c;
		System.out.println(key);
		if (!set.contains(key)) {
			set.add(key);
			List<Integer> listnum = new ArrayList<>();
			listnum.add(a);
			listnum.add(b);
			listnum.add(c);
			list.add(listnum);
		}

	}

}
