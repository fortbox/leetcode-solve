/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No704_二分查找;

class Solution {
    public static void main(String[] args) {

        int[] nums = {1,0,3,5,9,12};
        int target = 2;
        int result = search(nums, target);
        System.out.println("result = " + result);
    }


    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while (j-i>0) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            int k = (i + j) / 2;
            int temp = nums[k];
            if (temp == target) {
                return k;
            } else if (temp > target) {
                j=k-1;
            } else {
                i=k+1;
            }
        }
        if (nums[i]==target) return i;
        if (nums[j]==target) return j;
        return -1;
    }
}