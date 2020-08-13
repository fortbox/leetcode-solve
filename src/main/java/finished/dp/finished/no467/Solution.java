package finished.dp.finished.no467;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String p = "zaba";
        int ans = solution.findSubstringInWraproundString(p);
        System.out.println("ans = " + ans);
    }

    public int findSubstringInWraproundString(String p) {
        if (p.length() == 0) return 0;
        // dp[i][j+1]=dp[i][j]&s.contain(p.subString(i,i+j+1))
        // 看了powcai的思路，果然很巧。其实也是读懂了提议。
        Map<Character, Integer> dp = new HashMap<>();
        dp.put(p.charAt(0), 1);
        int initLen = 1;
        for (int i = 1; i < p.length(); i++) {
            System.out.println("p.charAt(i-1) = " + p.charAt(i - 1));
            System.out.println("p.charAt(i) = " + p.charAt(i));
            int dif = p.charAt(i) - p.charAt(i - 1);
            if (dif == 1 || (p.charAt(i - 1) == 'z' && p.charAt(i) == 'a')) {
                initLen++;
            } else {
                initLen = 1;
            }
            if (dp.getOrDefault(p.charAt(i), 0) < initLen) {
                dp.put(p.charAt(i), initLen);
            }
        }
        dp.forEach((key, value) -> System.out.println("k = " + key + ",v =" + value));
        return dp.values().stream().reduce(0, Integer::sum);
    }
}