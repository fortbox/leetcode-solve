/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1601;

class Solution {
    public int[] swapNumbers(int[] numbers) {
        int n = numbers[0] - numbers[1];
        return new int[]{numbers[0] - n, numbers[1] + n};
    }
}