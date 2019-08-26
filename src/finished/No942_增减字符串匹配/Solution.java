package finished.No942_增减字符串匹配;

class Solution {
    public int[] diStringMatch(String S) {
        int[] r = new int[S.length() + 1];
        int begin = 0;
        int end = S.length();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'I') {
                r[i] = begin;
                begin++;
                System.out.println("r[i] = " + r[i]);
                System.out.println(begin);
            }
            if (c == 'D') {
                r[i] = end;
                end--;
                System.out.println("r[i] = " + r[i]);
                System.out.println("end = " + end);
            }
        }
        if (begin == end) {
            r[r.length - 1] = begin;
        }
        return r;
    }
}
