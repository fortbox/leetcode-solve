/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No1170_比较字符串最小字母出现频次;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] iw = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            iw[i] = this.cal(words[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (String query : queries) {
            int k = this.cal(query);
            int m = 0;
            for (int i : iw) {
                if (i > k) {
                    m++;
                }
            }
            list.add(m);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private int cal(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        int k = 1;
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[0] == charArray[i]) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}