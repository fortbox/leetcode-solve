package No844_比较含退格的字符串;

class Solution {
    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        Solution solution = new Solution();
        boolean f = solution.backspaceCompare(S, T);
        System.out.println("f = " + f);
    }


    public boolean backspaceCompare(String S, String T) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if ('#' != c) {
                sb.append(c);
            } else {
                if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            }
        }
        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            if ('#' != c) {
                sb1.append(c);
            } else {
                if (sb1.length() > 0) sb1.deleteCharAt(sb1.length() - 1);
            }
        }
        return sb.toString().equals(sb1.toString());
    }
}
