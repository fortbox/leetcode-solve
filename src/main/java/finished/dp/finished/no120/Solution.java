package finished.dp.finished.no120;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> nowList = triangle.get(i);
            List<Integer> lastList = triangle.get(i - 1);
            for (int j = 0; j < nowList.size(); j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j < lastList.size()) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                dp[i][j] += nowList.get(j);
            }
            System.out.println(Arrays.toString(dp[i]));
        }
        return Arrays.stream(dp[triangle.size() - 1]).min().getAsInt();
    }
}
