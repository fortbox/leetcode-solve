/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No1111_有效括号的嵌套深度;

public class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        char[] array = seq.toCharArray();
        int[] a = new int[seq.length()];
        int index = 0;
        a[index++] = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                a[index] = a[index - 1];
                index++;
            } else {
                a[index] = a[index - 1] ^ 1;
            }
        }
        return a;
    }
}
