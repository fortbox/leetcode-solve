package greedy.No1217_玩筹码;

public class Solution {
    public int minCostToMoveChips(int[] chips) {
        int a = 0;
        int b = 0;
        for (int chip : chips) {
            if (chip % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }
        return Math.min(a, b);
    }
}
