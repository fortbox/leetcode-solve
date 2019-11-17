package greedy.No910_最小差值II;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] a = {10, 7, 1};
        int k = 3;
        smallestRangeII(a, k);
    }


    public static int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        int a = A[A.length - 1] - A[0];
        if (a <= K) {
            return a;
        }
        int res = a;
        for (int i = 1; i < A.length; i++) {
            int n_max = Math.max(A[A.length - 1] - K, A[i - 1] + K);
            int n_min = Math.min(A[0] + K, A[i] - K);
            res = Math.min(res, n_max - n_min);
        }
        return res;
    }
}
