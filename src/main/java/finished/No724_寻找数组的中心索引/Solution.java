/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No724_寻找数组的中心索引;

class Solution {
    public static void main(String[] args) {
        int[] nums={10};
        int result=pivotIndex(nums);
        System.out.println("result = " + result);
    }

    public static int pivotIndex(int[] nums) {
        //数组所有元素相加得到一个和
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        //从左开始遍历直到找到和的一半
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (temp == sum) return i;
            temp += nums[i];
        }
        return -1;
    }
}
