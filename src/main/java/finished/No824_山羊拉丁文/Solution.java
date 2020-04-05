/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No824_山羊拉丁文;

import java.util.HashSet;

class Solution {


    public static void main(String[] args) {
        String S="I speak Goat Latin";
        Solution solution = new Solution();
        String r=solution.toGoatLatin(S);
        System.out.println("r = " + r);
    }
    public String toGoatLatin(String S) {
        int i = 1;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        String[] ss = S.split("\\s");
        StringBuilder r = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        temp.append("a");
        for (String s : ss) {
            StringBuilder stringBuilder = new StringBuilder(s);
            if (!set.contains(s.charAt(0))) {
                stringBuilder.append(s.charAt(0));
                stringBuilder.deleteCharAt(0);
            }
            stringBuilder.append("ma");
            stringBuilder.append( temp);
            s = stringBuilder.toString();
            r.append(s);
            r.append(" ");
            temp.append("a");
        }
        return r.toString().substring(0, r.length() - 1);
    }
}
