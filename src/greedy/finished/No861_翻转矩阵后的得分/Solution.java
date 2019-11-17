package greedy.finished.No861_翻转矩阵后的得分;

public class Solution {
    public int matrixScore(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < A[0].length; j++) {
                    A[i][j] ^= A[i][j];
                }
            }
        }
        int res = 0;
        for (int i = 0; i < A[0].length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] == 1) {
                    count++;
                }
            }
            if (count < A.length) {
                count = A.length - count;
            }
            res = (res << 1) + count;
        }
        return res;
    }
}
