package No893_特殊等价字符串组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        String[] A = {"abc", "acb", "bac", "bca", "cab", "cba"};
        int result = numSpecialEquivGroups(A);
        System.out.println("result = " + result);
    }


    public static int numSpecialEquivGroups(String[] A) {
        HashSet<String> set = new HashSet<>();
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for (String s : A) {
            list1.clear();
            list2.clear();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (i % 2 == 0) {
                    list1.add(c);
                } else {
                    list2.add(c);
                }
            }
            char[] c1 = new char[list1.size()];
            char[] c2 = new char[list2.size()];
            for (int i = 0; i < list1.size(); i++) {
                c1[i] = list1.get(i);
            }
            for (int i = 0; i < list2.size(); i++) {
                c2[i] = list2.get(i);
            }
            Arrays.parallelSort(c1);
            Arrays.parallelSort(c2);
            set.add(String.valueOf(c1) + "," + String.valueOf(c2));
        }
        return set.size();
    }
}
