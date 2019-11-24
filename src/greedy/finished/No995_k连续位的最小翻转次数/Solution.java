package greedy.finished.No995_k连续位的最小翻转次数;

public class Solution {
    public int minKBitFlips(int[] A, int K) {
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                for (int j = i; j < i + K; j++) {
                    if (i + K <= A.length) {
                        A[j] ^= 1;
                    } else {
                        return -1;
                    }
                }
                res++;
            }
        }
        return res;
    }
}
