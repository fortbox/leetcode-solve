package finished.No994_腐烂的橘子;

class Solution {
    public int orangesRotting(int[][] grid) {
        //1,首先判断是否有上下左右都是空格的，如果有则直接返回
        if (judgeAllBlank(grid)) return 0;
        if (judgeALLFresh(grid)) return -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                boolean up = true;
                boolean down = true;
                boolean left = true;
                boolean right = true;
                if (grid[i][j] == 1) {
                    if (i - 1 >= 0) {
                        if (grid[i - 1][j] != 0) {
                            up = false;
                        }
                    }
                    if (i + 1 < grid.length) {
                        if (grid[i + 1][j] != 0) {
                            down = false;
                        }
                    }
                    if (j - 1 >= 0) {
                        if (grid[i][j - 1] != 0) {
                            left = false;
                        }
                    }
                    if (j + 1 < grid[0].length) {
                        if (grid[i][j + 1] != 0) {
                            right = false;
                        }
                    }
                    if (up && down && left && right) {
                        return -1;
                    }
                }
            }
        }
        //2，遍历然后判断直到全部为烂橘子
        int step = 0;
        int[][] temps = new int[grid.length][grid[0].length];
        while (!judge(grid)) {
            if (equals(temps, grid)) return -1;
            temps = this.copy(grid);
            for (int i = 0; i < temps.length; i++) {
                for (int j = 0; j < temps[0].length; j++) {
                    if (temps[i][j] == 2) {
                        if (i - 1 >= 0) {
                            if (grid[i - 1][j] == 1) {
                                grid[i - 1][j] = 2;
                            }
                        }
                        if (i + 1 < grid.length) {
                            if (grid[i + 1][j] == 1) {
                                grid[i + 1][j] = 2;
                            }
                        }
                        if (j - 1 >= 0) {
                            if (grid[i][j - 1] == 1) {
                                grid[i][j - 1] = 2;
                            }
                        }
                        if (j + 1 < grid[0].length) {
                            if (grid[i][j + 1] == 1) {
                                grid[i][j + 1] = 2;
                            }
                        }
                    }
                }
            }
            step++;
        }
        return step;
    }

    private boolean judge(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int temp = grid[i][j];
                if (temp != 0 && temp != 2) {
                    return false;
                }
            }
        }
        return true;
    }

    private int[][] copy(int[][] grid) {
        int[][] result = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result[i][j] = grid[i][j];
            }
        }
        return result;
    }

    private boolean judgeALLFresh(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 1) return false;
            }
        }
        return true;
    }

    private boolean judgeAllBlank(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) return false;
            }
        }
        return true;
    }

    private boolean equals(int[][] temps, int[][] grid) {
        for (int i = 0; i < temps.length; i++) {
            for (int j = 0; j < temps[0].length; j++) {
                if (temps[i][j] != grid[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
