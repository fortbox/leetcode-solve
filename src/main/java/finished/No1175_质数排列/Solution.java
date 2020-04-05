/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No1175_质数排列;

class Solution {

    public static void main(String[] args) {
        int n = 100;
        int res = numPrimeArrangements(n);
        System.out.println("res = " + res);
    }

    public static int numPrimeArrangements(int n) {
        //1,先找到一共多少个质数,然后排列组合
        int mm = 0;
        boolean[] bs = new boolean[n + 1];
        for (int i = 1; i < n + 1; i++) {
            bs[i] = true;
        }
        bs[1] = false;
        for (int i = 2; i <= n; i++) {
            int m = 2;
            while (m * i <= n) {
                bs[m * i] = false;
                m++;
            }
        }

        for (int i = 1; i < bs.length; i++) {
            if (bs[i]) {
                mm++;
            }
        }
        int a = 1;
        int b = 1;
        long r1 = 1;
        while (a <= mm) {
            r1 = ((r1 * a) % 1000000007);
            a++;
        }
        long r2 = 1;
        while (b <= (n - mm)) {
            r2 = ((r2 * b) % 1000000007);
            b++;
        }

        return (int) ((r1 * r2) % 1000000007);

    }
}