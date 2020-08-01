package finished.dp.finished.no91;

class Solution {
    public static int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < s.length(); i++) {
            char c1 = s.charAt(i - 1);
            char c2 = s.charAt(i);
            if (c2 == '0') {
                if (c1 <= '2' && c1 > '0') dp[i + 1] = dp[i - 1];
                else return 0;
            } else {
                if (c1 == '0') {
                    dp[i + 1] = dp[i];
                } else if (c1 == '1') {
                    dp[i + 1] = dp[i] + dp[i - 1];
                } else if (c1 == '2') {
                    if (c2 >= '1' && c2 <= '6') {
                        dp[i + 1] = dp[i] + dp[i - 1];
                    } else {
                        dp[i + 1] = dp[i];
                    }
                } else {
                    dp[i + 1] = dp[i];
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "226";
        int res = numDecodings(s);
        System.out.println("res = " + res);
    }
}