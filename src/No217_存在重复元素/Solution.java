package No217_存在重复元素;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] nums= {1,1,1,3,3,4,3,2,4,2};
		Solution solution = new Solution();
		System.out.println(solution.containsDuplicate(nums));

	}

	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (hashSet.contains(nums[i])) {
				return true;
			}else {
				hashSet.add(nums[i]);
			}
		}
		return false;
	}

}
