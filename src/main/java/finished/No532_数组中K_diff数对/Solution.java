/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No532_数组中K_diff数对;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,1};
        int k = 1;
        System.out.println(findPairs(nums, k));

    }

    /**
     * 遍历，然后用map保存，最后计算map的大小
     *
     * @param nums
     * @param k
     * @return
     */
    public static int findPairs(int[] nums, int k) {
        Arrays.parallelSort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp=nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]>temp+k){
                    break;
                }
                if (nums[j]==temp+k){
                    map.put(temp,nums[j]);
                }
            }
        }
        return map.size();
    }
}
