package finished.dp.finished.no361;

class Solution {
    public int maxKilledEnemies(char[][] grid) {
        /**
         * 只想到了暴力解法
         */
        int maxValue = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0') {
                    int left = find(i, j, grid, "left");
                    int right = find(i, j, grid, "right");
                    int up = find(i, j, grid, "up");
                    int down = find(i, j, grid, "down");
                    int total = left + right + up + down;
                    maxValue = Math.max(maxValue, total);
                }
            }
        }
        return maxValue;
    }

    private int find(int i, int j, char[][] grid, String direction) {
        int count = 0;
        if ("left".equals(direction)) {
            if (j == 0) return 0;
            j -= 1;
            while (j >= 0) {
                if (grid[i][j] == 'E') count++;
                if (grid[i][j] == 'W') break;
                j--;
            }
        } else if ("right".equals(direction)) {
            if (j == grid[0].length) return 0;
            j += 1;
            while (j <= grid[0].length - 1) {
                if (grid[i][j] == 'E') count++;
                if (grid[i][j] == 'W') break;
                j++;
            }

        } else if ("up".equals(direction)) {
            if (i == 0) return 0;
            i -= 1;
            while (i >= 0) {
                if (grid[i][j] == 'E') count++;
                if (grid[i][j] == 'W') break;
                i--;
            }

        } else if ("down".equals(direction)) {
            if (i == grid.length - 1) return 0;
            i += 1;
            while (i <= grid.length - 1) {
                if (grid[i][j] == 'E') count++;
                if (grid[i][j] == 'W') break;
                i++;
            }
        }
        return count;
    }
}
