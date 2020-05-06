/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No1018_可被5整除的二进制前缀;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        StringBuilder builder = new StringBuilder();
        List<Boolean> list = new ArrayList<>();
        for (int i : A) {
            System.out.println("i = " + i);
            builder.append(i);
            String s = builder.toString();
            int k = s.charAt(s.length() - 1) - '0';
            for (int j = s.length() - 2; j >= 0; j -= 4) {
                if (j - 0 >= 0) {
                    int m = s.charAt(j - 0) - '0';
                    k += m * 2;
                }

                System.out.println("2 k = " + k);
                if (j - 1 >= 0) {
                    int m = s.charAt(j - 1) - '0';
                    k += m * 4;
                }
                System.out.println("4 k = " + k);
                if (j - 2 >= 0) {
                    int m = s.charAt(j - 2) - '0';
                    k += m * 8;
                }
                System.out.println("6 k = " + k);
                if (j - 3 >= 0) {
                    int m = s.charAt(j - 3) - '0';
                    k += m * 6;
                }
                System.out.println("8 k = " + k);
            }
            if (k % 5 == 0) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
