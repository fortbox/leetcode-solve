package finished.others.finished.no474;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        int ans = solution.findMaxForm(strs, m, n);
        System.out.println("ans = " + ans);
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length + 1][m + 1][n + 1];
        for (int i = 1; i <= strs.length; i++) {
            String s = strs[i - 1];
            int m_0 = 0;
            int m_1 = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') m_0++;
                if (c == '1') m_1++;
            }
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    if (j >= m_0 && k >= m_1) {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - m_0][k - m_1] + 1);
                    } else {
                        dp[i][j][k] = dp[i - 1][j][k];
                    }
                }
            }
        }
        return dp[strs.length][m][n];
    }
}