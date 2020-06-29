/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0105;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String first = "horse";
        String second = "ros";
        boolean result = solution.oneEditAway(first, second);
        System.out.println("result = " + result);
    }

    public boolean oneEditAway(String first, String second) {
        int len1 = first.length();
        int len2 = second.length();
        if (len1 == len2) {
            int k = 0;
            for (int i = 0; i < len1; i++) {
                if (first.charAt(i) != second.charAt(i)) k++;
                if (k > 1) return false;
            }
            return true;
        } else if (len1 > len2) {
            if (len1 - len2 > 1) return false;
            for (int i = 0; i < len1; i++) {
                String tmp = first.substring(0, i) + first.substring(i + 1);
                if (tmp.equals(second)) return true;
            }
            return false;
        } else {
            if (len2 - len1 > 1) return false;
            for (int i = 0; i < len2; i++) {
                String tmp = second.substring(0, i) + second.substring(i + 1);
                if (tmp.equals(first)) return true;
            }
            return false;
        }
    }
}
