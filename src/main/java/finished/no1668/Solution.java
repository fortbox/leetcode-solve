/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no1668;

class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = sequence.length() / word.length();
        String tmp = word;
        for (int i = 0; i < k; i++) {
            word += tmp;
        }
        System.out.println("word = " + word);
        System.out.println("k = " + k);
        for (int i = k; i >= 1; i--) {
            System.out.println("word = " + word);
            System.out.println("k = " + k);
            if (sequence.contains(word)) {
                return k;
            }
            word = word.substring(tmp.length());
        }
        return 0;
    }
}
