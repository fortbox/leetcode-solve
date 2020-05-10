/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1295;

import java.util.Arrays;

class Solution {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums).mapToObj(String::valueOf).filter(s -> s.length() % 2 == 1).count();
    }
}
