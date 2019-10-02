package No1037_有效的回旋镖;

import java.util.Arrays;

class Solution {
    public boolean isBoomerang(int[][] points) {
        int x0 = (points[0][0] - points[1][0]);
        int y0 = (points[0][1] - points[1][1]);
        int x1 = (points[1][0] - points[2][0]);
        int y1 = (points[1][1] - points[2][1]);
        int x2 = (points[0][0] - points[2][0]);
        int y2 = (points[0][1] - points[2][1]);
        double[] arr = new double[3];
        arr[0] = Math.pow(x0, 2) + Math.pow(y0, 2);
        arr[1] = Math.pow(x1, 2) + Math.pow(y1, 2);
        arr[2] = Math.pow(x2, 2) + Math.pow(y2, 2);
        Arrays.sort(arr);
        return Math.sqrt(arr[0]) + Math.sqrt(arr[1]) > Math.sqrt(arr[2]);
    }
}
