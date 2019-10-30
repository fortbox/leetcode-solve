package greedy.finished.No502_IPO;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int k = 2;
        int W = 0;
        int[] Profits = {1, 2, 3};
        int[] Capital = {0, 1, 1};
        int res = solution.findMaximizedCapital(k, W, Profits, Capital);
        System.out.println("res = " + res);
    }

    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        int[][] init = new int[Profits.length][2];
        for (int i = 0; i < init.length; i++) {
            init[i][0] = Profits[i];
            init[i][1] = Capital[i];
        }
        Arrays.sort(init, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o2[0] - o1[0]);
        ArrayList<int[]> list = new ArrayList<>(Arrays.asList(init));
        B:
        while (k > 0) {
            int i = 0;
            for (; i < list.size(); i++) {
                int[] a = list.get(i);
                if (W >= a[1]) {
                    k--;
                    W += a[0];
                    list.remove(i);
                    break;
                }
                if (i == (list.size() - 1) && W < a[1]) {
                    break B;
                }
            }
            if (list.size() == 0) {
                break;
            }
        }
        return W;
    }
}
