package finished.No977_有序数组的平方;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        //平方然后再排序
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.parallelSort(A);
        return A;
    }
}
