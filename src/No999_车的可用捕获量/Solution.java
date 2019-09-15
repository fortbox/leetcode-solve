package No999_车的可用捕获量;

class Solution {
    public int numRookCaptures(char[][] board) {
        /**
         * 1，找到B的位置
         * 2，上下左右找
         */
        //1
        int[] location = new int[2];
        location = this.findLocation(board);
        int row = location[0];
        int column = location[1];
        int sum = 0;
        //up
        for (int i = 1; row - i >= 0; i++) {
            char c = board[row - i][column];
            if (c == 'p') {
                sum++;
                break;
            }
            if (c == 'B') {
                break;
            }
        }
        //down
        for (int i = 1; row + i < board.length; i++) {
            char c = board[row + i][column];
            if (c == 'p') {
                sum++;
                break;
            }
            if (c == 'B') {
                break;
            }
        }
        //left
        for (int i = 1; column - i >= 0; i++) {
            char c = board[row][column - i];
            if (c == 'p') {
                sum++;
                break;
            }
            if (c == 'B') {
                break;
            }
        }
        //right
        for (int i = 1; column + i < board[0].length; i++) {
            char c = board[row][column + i];
            if (c == 'p') {
                sum++;
                break;
            }
            if (c == 'B') {
                break;
            }
        }
        return sum;
    }

    private int[] findLocation(char[][] board) {
        int[] location = new int[2];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    location[0] = i;
                    location[1] = j;
                    break;
                }
            }
        }
        return location;
    }
}
