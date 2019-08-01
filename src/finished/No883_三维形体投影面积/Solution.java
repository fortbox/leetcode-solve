package finished.No883_三维形体投影面积;

class Solution {
    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {3, 4}};
        int result = projectionArea(grid);
        System.out.println("result = " + result);
    }


    public static int projectionArea(int[][] grid) {
        int xy = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) xy++;
            }
        }
        System.out.println("xy = " + xy);
        int yz = 0;
        for (int i = 0; i < grid[0].length; i++) {

            int temp = 0;
            for (int i1 = 0; i1 < grid.length; i1++) {
                temp = Math.max(grid[i1][i], temp);
            }
            System.out.println("temp = " + temp);
            yz += temp;
        }
        System.out.println("yz = " + yz);
        int xz = 0;
        for (int i = 0; i < grid.length; i++) {
            int temp = 0;
            for (int j = 0; j < grid[0].length; j++) {
                temp = Math.max(temp, grid[i][j]);
            }
            System.out.println("temptt = " + temp);
            xz += temp;
        }
        System.out.println("xz = " + xz);
        return xy + yz + xz;
    }
}
