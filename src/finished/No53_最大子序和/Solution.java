package finished.No53_最大子序和;

public class Solution {

	public static void main(String[] args) {
		int[] nums = { -2, -1, -3, -4, -1, -2, -1, -5, -4 };
		int a = maxSubArray(nums);
		System.out.println(a);
	}

	public static int maxSubArray(int[] nums) {
        int max = 0;
        int cur = 0;
        int findx=nums[0];
        /**
         * 处理全是负数的情况
         */
        for (int i = 0; i < nums.length; i++) {
			if (nums[i]>0) {
				break;
			}else{
				if (findx<nums[i]) {
					findx=nums[i];
				}
				if (i==nums.length-1) {
					return findx;
				}
			}
		}
        /**
         * 处理一般情况
         */
        for(int i = 0; i < nums.length; i++) {
            cur +=nums[i];
            max = Math.max(cur, max);
            cur = cur < 0 ? 0 : cur;
        }
        return max;
	}
	
	/**
	 * 分治法我暂时理解不了
	 */
}
