/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 2, 3};
        wiggleSort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }

    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        List<Integer> list = new ArrayList<>();
        while (i < j) {
            list.add(nums[j]);
            list.add(nums[i]);
            i++;
            j--;
        }
        if (i == j) list.add(nums[j]);
        System.out.println("list = " + list);
        for (int k = 0; k < nums.length; k++) {
            nums[k] = list.get(k);
        }
    }
}
