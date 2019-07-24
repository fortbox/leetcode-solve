package finished.No812_最大三角形面积;

class Solution {
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    int ax = points[i][0];
                    int ay = points[i][1];
                    int bx = points[j][0];
                    int by = points[j][1];
                    int cx = points[k][0];
                    int cy = points[k][1];
                    double square =
                            ((by - ay) * (bx - ax) / 2.0
                                    + (by - ay) * (cx - bx) / 2.0
                                    + (bx - ax) * (ay - cy) / 2.0);
                    System.out.println("square = " + square);
                    max = Math.max(max, Math.abs(square));
                }

            }
        }
        return max;
    }
}
