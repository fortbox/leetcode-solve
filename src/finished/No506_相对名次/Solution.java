package finished.No506_相对名次;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {

	public static void main(String[] args) {

		int[] nums = { 5, 4, 3, 2, 1 };
		String[] sa = findRelativeRanks(nums);
		for (String string : sa) {
			System.out.println(string);
		}
	}

	/**
	 * 1，用map保存原始数组 2，对数组排序 <br/>
	 * 3，遍历保存，并替换前三。
	 */
	public static String[] findRelativeRanks(int[] nums) {
		String[] sa = new String[nums.length];
		if (nums.length == 1) {
			sa[0] = "Gold Medal";
			return sa;
		}
		if (nums.length == 2) {
			if (nums[0] > nums[1]) {
				sa[0] = "Gold Medal";
				sa[1] = "Silver Medal";
			} else {
				sa[1] = "Gold Medal";
				sa[0] = "Silver Medal";
			}
			return sa;
		}

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < sa.length; i++) {
			map.put(i, String.valueOf(nums[i]));
		}
		int n = nums.length - 1;
		Arrays.parallelSort(nums);
		for (Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			int value = Integer.valueOf(entry.getValue()).intValue();
			if (value == nums[n - 0]) {
				map.put(key, "Gold Medal");
			} else if (value == nums[n - 1]) {
				map.put(key, "Silver Medal");
			} else if (value == nums[n - 2]) {
				map.put(key, "Bronze Medal");
			}
			for (int i = 0; i < nums.length-3; i++) {
				if (value==nums[i]) {
					map.put(key,String.valueOf(n+1-i));
				}
			}

		}
		for (int i = 0; i < sa.length; i++) {
			sa[i] = map.get(i);
		}
		return sa;

	}
}
