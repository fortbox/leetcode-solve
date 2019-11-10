package greedy.No767_重构字符串;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String S = "abbabbaaab";
        String res = reorganizeString(S);
        System.out.println("res = " + res);
    }

    public static String reorganizeString(String S) {
        char[] array = S.toCharArray();
        int[] a = new int[26];
        for (int i = 0; i < array.length; i++) {
            a[array[i] - 'a']++;
        }
        int[][] b = new int[26][2];
        for (int i = 0; i < a.length; i++) {
            b[i][0] = i;
            b[i][1] = a[i];
        }
        Arrays.sort(b, ((o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o2[1] - o1[1]));
        if (S.length() % 2 == 0) {
            if (b[0][1] > S.length() / 2)
                return "";
        } else {
            if (b[0][1] > S.length() / 2 + 1)
                return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 1;
        while (true) {
            char m, n;
            if (b[i][1] > 0 && b[j][1] > 0) {
                m = (char) (b[i][0] + 'a');
                b[i][1]--;
                n = (char) (b[j][0] + 'a');
                b[j][1]--;
                sb.append(m);
                sb.append(n);
                Arrays.sort(b, ((o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o2[1] - o1[1]));
            } else {
                break;
            }
        }
        Arrays.sort(b, ((o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o2[1] - o1[1]));
        if (b[0][1] > 0) sb.append((char) (b[0][0] + 'a'));
        return sb.toString();
    }


}
