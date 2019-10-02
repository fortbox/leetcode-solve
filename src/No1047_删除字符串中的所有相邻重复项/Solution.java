package No1047_删除字符串中的所有相邻重复项;

class Solution {
    public static void main(String[] args) {
        String S = "abbaca";
        String res = removeDuplicates(S);
        System.out.println("res = " + res);
    }

    public static String removeDuplicates(String S) {
        boolean end = true;
        String s = S;
        while (end) {
            int k = s.length();
            s = removeOnce(s);
            if (k == s.length()) {
                end = false;
            }
        }
        return s;
    }

    private static String removeOnce(String s) {
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                builder.delete(i, i + 2);
                break;
            }
        }
        return builder.toString();
    }
}
