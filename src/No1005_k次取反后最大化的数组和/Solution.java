package No1005_k次取反后最大化的数组和;

import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        /**
         * 1，排序
         * 2，查看有几个负数
         * 3，查看负数和K的关系
         * 4，如果负数个数小于K，则要看相减后的值是偶数还是奇数
         * 5，如果负数个数大于K，则从最小的开始选择。
         */
        //1
        Arrays.parallelSort(A);
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                num++;
            } else {
                break;
            }
        }
        //2
        int m = K - num;
        if (m == 0) {
            int sum = 0;
            for (int i : A) {
                if (i < 0) {
                    i = -i;
                }
                sum += i;
            }
            return sum;
        } else if (m < 0) {
            int sum = 0;
            int k = K;
            for (int i : A) {
                if (i < 0 && k > 0) {
                    i = -i;
                }
                sum += i;
                k--;
            }
            return sum;
        } else if (m > 0) {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] < 0) {
                    A[i] = -A[i];
                }
                sum += A[i];
            }
            Arrays.parallelSort(A);
            if (m % 2 == 0) {
                return sum;
            } else {
                sum = sum - 2 * A[0];
                return sum;
            }
        }
        return 0;
    }
}
