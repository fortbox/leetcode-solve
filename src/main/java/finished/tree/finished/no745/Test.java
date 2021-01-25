/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no745;

public class Test {
    public static void main(String[] args) {
        WordFilter filter = new WordFilter(new String[]{"cabaabaaaa", "ccbcababac", "bacaabccba", "bcbbcbacaa", "abcaccbcaa", "accabaccaa", "cabcbbbcca", "ababccabcb", "caccbbcbab", "bccbacbcba"});
        int ans = filter.f("ab", "abcaccbcaa");
        System.out.println("ans = " + ans);
    }
}
