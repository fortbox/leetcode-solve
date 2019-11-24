package greedy.No991_坏了的计算器;

public class Solution {
    public int brokenCalc(int X, int Y) {
        int res = 0;
        if (X == Y) return res;
        if (X > Y) {
            return X - Y;
        }
        if (Y % 2 == 0) {
            res++;
            res += brokenCalc(X, Y / 2);
        } else {
            res += 2;
            res += brokenCalc(X, (Y + 1) / 2);
        }
        return res;
    }
}
