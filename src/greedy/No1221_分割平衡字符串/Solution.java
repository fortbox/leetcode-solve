package greedy.No1221_分割平衡字符串;

public class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;
        char[] array = s.toCharArray();
        int index_R = 0;
        int index_L = 0;
        for (char c : array) {
            if (c == 'R') {
                if (index_L > 1) {
                    index_L--;
                } else if (index_L == 1) {
                    index_L = 0;
                    index_R = 0;
                    res++;
                } else if (index_L == 0) {
                    index_R++;
                }
            } else {
                if (index_R > 1) {
                    index_R--;
                } else if (index_R == 1) {
                    index_R = 0;
                    index_L = 0;
                    res++;
                } else if (index_R == 0) {
                    index_L++;
                }

            }
        }
        return res;
    }
}
