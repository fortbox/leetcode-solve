/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1613;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] square1 = {-1, 1, 5};
        int[] square2 = {-2, -2, 7};
        double[] res = cutSquares(square1, square2);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }

    public static double[] cutSquares(int[] square1, int[] square2) {
        double x0 = square1[0];
        double y0 = square1[1];
        double z0 = square1[2];
        double cx0 = x0 + z0 / 2;
        double cy0 = y0 + z0 / 2;
        System.out.println("(cx0,cy0)=(" + cx0 + "," + cy0 + ")");
        double x1 = square2[0];
        double y1 = square2[1];
        double z1 = square2[2];
        double cx1 = x1 + z1 / 2;
        double cy1 = y1 + z1 / 2;
        System.out.println("(cx1,cy1)=(" + cx1 + "," + cy1 + ")");

        double[] ans = new double[4];

        // 分三种情况，平行于x，平行于y，其他
        double miny = Math.max(y0 + z0, y1 + z1);
        if (cx0 == cx1) {
            ans[0] = ans[2] = cx0;
            ans[1] = Math.min(y0, y1);
            ans[3] = miny;
            return ans;
        }
        double a = (cy1 - cy0) / (cx1 - cx0);
        double b = cy0 - a * cx0;

        if (Math.abs(a) < 1) {
            double t1 = Math.min(x0, x1);
            double t2 = Math.max(x0 + z0, x1 + z1);
            double t3 = a * t1 + b;
            double t4 = a * t2 + b;
            return new double[]{t1, t3, t2, t4};
        } else {
            double t1 = Math.min(y0, y1);
            double t2 = miny;
            double t3 = (t1 - b) / a;
            double t4 = (t2 - b) / a;
            if (t3 <= t4) return new double[]{t3, t1, t4, t2};
            else return new double[]{t4, t2, t3, t1};
        }
    }
}
