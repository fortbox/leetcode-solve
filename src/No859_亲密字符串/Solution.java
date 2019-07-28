package No859_亲密字符串;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.equals(B)) {
            char[] aa = A.toCharArray();
            char[] bb = B.toCharArray();
            Arrays.sort(aa);
            Arrays.sort(bb);
            for (int i = 0; i < A.length() - 1; i++) {
                if (aa[i] == aa[i + 1]) return true;
            }
        }
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) list.add(i);
            if (list.size() > 2) return false;
        }
        if (list.size() != 2) return false;
        char c = A.charAt(list.get(0));
        char d = A.charAt(list.get(1));
        if (c == B.charAt(list.get(1)) && d == B.charAt(list.get(0))) return true;
        return false;
    }
}
