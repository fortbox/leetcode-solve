/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.no1761;

class Solution {
    public int totalMoney(int n) {
        int a = n / 7;
        int b = n % 7;
        int c = 1 + 2 + 3 + 4 + 5 + 6 + 7;
        if (a == 0) {
            return sum(b);
        } else {
            int d = 0;
            for (int i = 1; i <= a; i++) {
                d += i * c;
            }
            d += (a + 1) * sum(b);
            return d;
        }
    }

    private int sum(int n) {
        int t = 0;
        for (int i = 1; i <= n; i++) {
            t += i;
        }
        return t;
    }
}
