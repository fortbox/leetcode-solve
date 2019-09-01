package finished.No976_三角形的最大周长;

import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.parallelSort(A);
        int result = 0;
        for (int i = A.length - 1; i >= 2; i--) {
            int a = A[i - 2];
            int b = A[i - 1];
            int c = A[i];
            if (a + b > c) {
                result = a + b + c;
                return result;
            }
        }
        return result;
    }
}
