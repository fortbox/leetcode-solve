package greedy.finished.No316_去除重复字母;

import java.util.Arrays;

public class Solution {
    /**
     * 思路：先记录每个字母的出现的次数，开个26的数组。
     * 每次贪心，我们就找当前字符串最小的数，如果遇到某个字符的个数为1的话，
     * 那么我们就跳出来，把当前遍历到的最小的字符取出来，接着从pos+1的位置
     * 切断字符串并且删除切断字符串中出现的当前最小字符，
     * 继续对其进行搜索。
     */
    public int[] ct;

    public String removeDuplicateLetters(String s) {
        ct = new int[26];
        return solve(s);
    }

    public String solve(String s) {
        if (s == null || s.equals("")) {
            return "";
        }
        Arrays.fill(ct, 0);
        for (char cur : s.toCharArray()) {
            ++ct[cur - 'a'];
        }
        int i = 0;
        int pos = 0;
        for (; i < s.length(); ++i) {
            if (s.charAt(i) < s.charAt(pos)) {
                pos = i;
            }
            --ct[s.charAt(i) - 'a'];
            if (ct[s.charAt(i) - 'a'] == 0) {
                break;
            }
        }
        return s.charAt(pos) + solve(s.substring(pos + 1).replace("" + s.charAt(pos), ""));
    }
}
