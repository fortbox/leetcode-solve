package greedy.No44_通配符匹配;

class Solution {
    private static long loopTime = 0;

    public static void main(String[] args) {
        long startMillionSeconds = System.currentTimeMillis();
//        String s = "acdcb";
//        String p = "a*c?b";
        String s =
                "abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb";
        String p = "**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb" +
                "**a*b*bb";
//        "acdcb"
//        "a*c?b"
        boolean res = isMatch(s, p);
        long endMillionSeconds = System.currentTimeMillis();

        long time = (endMillionSeconds - startMillionSeconds);
        System.out.println("time = " + time);
        System.out.println("res = " + res);
    }


    /**
     * 参考的网上的解法，其实自己的思路和这个是一样的，但是自己写的就是执行有点问题。
     *
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length(), i_start = -1, j_start = -1, i = 0, j = 0;
        while (i < m) {
            if (j < n && p.charAt(j) == '*') {
                j_start = j;
                i_start = i;
                j++;

            } else if (j < n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j_start > -1) {
                j = j_start;
                i = i_start + 1;
            } else {
                return false;
            }
        }
        while (j < n && p.charAt(j) == '*') {
            j++;
        }
        return j == n;
    }
}
