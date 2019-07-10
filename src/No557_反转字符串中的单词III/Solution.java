package No557_反转字符串中的单词III;

class Solution {
    /**
     * 把字符串改成字符串数组，然后在每个反转。
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        String sa = "";
        for (int i = 0; i < ss.length; i++) {
            StringBuilder sb = new StringBuilder(ss[i]);
            sa += sb.reverse().toString() + " ";
        }
        return sa.substring(0, sa.length() - 1);
    }
}
