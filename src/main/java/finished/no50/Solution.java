/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no50;

class Solution {
    public double myPow(double x, int n) {
        if (n == 1) return x;
        if (n == -1) return 1 / x;
        if (n % 2 == 0) {
            return myPow(x, n / 2) * myPow(x, n / 2);
        } else {
            double c = myPow(x, n / 2) * myPow(x, n / 2);
            if (n > 0) {
                return c * x;
            } else {
                return c * myPow(x, -1);
            }
        }
    }
}
