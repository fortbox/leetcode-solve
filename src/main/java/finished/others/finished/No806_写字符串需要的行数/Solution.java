/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No806_写字符串需要的行数;

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int[] nums = new int[2];
        char[] array = S.toCharArray();
        int remain = 100;
        nums[0] = 1;
        for (char c : array) {
            int temp = widths[c - 'a'];
            if (remain >= temp) {
                remain -= temp;
            } else if (remain < temp) {
                nums[0]++;
                remain = 100;
                remain -= temp;
            }
        }
        nums[1] = 100 - remain;
        return nums;
    }
}
