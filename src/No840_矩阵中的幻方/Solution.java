package No840_矩阵中的幻方;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        //Traverse counting
        int n = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                int[] a = new int[9];
                int temp = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        a[temp++] = grid[i + k][j + l];
                    }
                }
                Arrays.sort(a);
                boolean f = true;
                for (int i1 = 0; i1 < a.length; i1++) {
                    if (i1 + 1 != a[i1]) f = false;
                }

                if (!f) continue;
                int line1 = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                int line2 = grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2];
                int line3 = grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                int cul1 = grid[i][j] + grid[i + 1][j] + grid[i + 2][j];
                int cul2 = grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1];
                int cul3 = grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2];
                int x1 = grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2];
                int x2 = grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j];
                if (line1 == line2 && line2 == line3 && line3 == cul1
                        && cul1 == cul2 && cul2 == cul3 && cul3 == x1 && x1 == x2) {
                    n++;
                }
            }
        }
        return n;
    }
}
