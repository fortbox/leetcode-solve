/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.剑指offer.jz45;

import java.util.Arrays;

public class Solution {
    public String minNunber(int[] nums) {
        String[] array = Arrays.stream(nums).boxed().map(String::valueOf).toArray(String[]::new);
        Arrays.sort(array, ((o1, o2) -> (o1 + o2).compareTo(o2 + o1)));
        return Arrays.stream(array).reduce("", (o1, o2) -> o1 + o2);
    }
}
