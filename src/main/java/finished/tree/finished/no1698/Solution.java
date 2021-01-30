/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.tree.finished.no1698;

import java.util.HashSet;

class Solution {
    public int countDistinct(String s) {
        HashSet<String> set = new HashSet<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                String s1 = s.substring(i, j);
                set.add(s1);
            }
        }
        return set.size();
    }
}
