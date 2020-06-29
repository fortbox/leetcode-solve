/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0807;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String S = "qwe";
        String[] strings = solution.permutation(S);
        System.out.println("strings = " + Arrays.toString(strings));
    }

    public String[] permutation(String S) {
        if (S == null || "".equals(S)) {
            return new String[]{""};
        }
        String[] ss = permutation(S.substring(0, S.length() - 1));
        Set<String> set = new HashSet<>();
        for (String s : ss) {
            System.out.println("s = " + s);
            for (int i = 0; i <= s.length(); i++) {
                set.add(s.substring(0, i) + S.charAt(S.length() - 1) + s.substring(i));
            }
        }
        System.out.println("set = " + set.toString());
        return set.toArray(new String[set.size()]);
    }
}
