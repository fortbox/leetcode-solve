package N0219_存在重复元素II;

public class Solution {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					if (j-1<=k) {
						return true;
					}
				}
			}
		}
		return false;
	}
	/**
	 * 也可以考虑用hashmap实现
	 * 
	 */
}
