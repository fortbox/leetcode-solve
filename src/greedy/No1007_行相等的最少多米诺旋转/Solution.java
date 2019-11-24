package greedy.No1007_行相等的最少多米诺旋转;


import java.util.Arrays;

public class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int[] a = new int[7];
        int res = -1;
        for (int i : A) {
            a[i]++;
        }
        for (int i : B) {
            a[i]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= A.length) {
                int b = swap(A, B, i);
                if (b == -1) {
                    continue;
                } else {
                    res = Math.min(b, swap(B, A, i));
                    break;
                }
            }
        }
        return res;


    }

    private int swap(int[] A, int[] B, int n) {
        int res = 0;
        int[] a = Arrays.copyOf(A, A.length);
        int[] b = Arrays.copyOf(B, B.length);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != n && b[i] != n) {
                return -1;
            } else if (a[i] != n && b[i] == n) {
                res++;
            }
        }
        return res;
    }
}
