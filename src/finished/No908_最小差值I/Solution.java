package finished.No908_最小差值I;

import java.util.Arrays;

class Solution {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int size = A[A.length - 1] - A[0];
        if (size <= 2 * K) {
            return 0;
        }
        return size - 2 * K;
    }
}
