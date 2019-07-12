package No581_最短无序连续子数组;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        Solution solution = new Solution();
        int result = solution.findUnsortedSubarray(nums);
        System.out.println("result = " + result);
    }

    public int findUnsortedSubarray(int[] nums) {
        int[] k = new int[nums.length];

        for (int i = 0; i < k.length; i++) {
            k[i] = nums[i];
        }
        Arrays.parallelSort(k);
        int begin = 0;
        int end = 0;
        for (int i = 0; i < k.length; i++) {
            if (k[i] != nums[i]) {
                begin = i;
                break;

            }
        }
        for (int i = k.length - 1; i >= 0; i--) {
            if (k[i] != nums[i]) {
                end = i;
                break;
            }
        }
        int m = end - begin;
        return m > 0 ? m + 1 : m;
    }
}
