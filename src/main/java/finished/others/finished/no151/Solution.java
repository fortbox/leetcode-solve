/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no151;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "  hello world!  ";
        String ans = solution.reverseWords(s);
        System.out.println("ans = " + ans);
    }

    public String reverseWords(String s) {
        s = s.trim();
        // 正则表达式
        String[] array = s.split("\\s+");
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        StringBuilder builder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != null && !"".equals(array[i])) {
                builder.append(array[i]);
                if (i > 0) builder.append(" ");
            }
        }
        return builder.toString();
    }
}