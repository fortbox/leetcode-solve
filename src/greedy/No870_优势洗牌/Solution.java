package greedy.No870_优势洗牌;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] A = {12, 24, 8, 32};
        int[] B = {13, 25, 32, 11};
        int[] res = advantageCount(A, B);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }

    public static int[] advantageCount(int[] A, int[] B) {
        Arrays.parallelSort(A);
        int[] res = new int[A.length];
        int[][] a = new int[A.length][2];
        for (int i = 0; i < a.length; i++) {
            a[i][0] = A[i];
            a[i][1] = 1;
        }
        int n = 0;
        for (int i = 0; i < B.length; i++) {
            for (int i1 = 0; i1 < a.length; i1++) {
                if (a[i1][1] == 1 && a[i1][0] > B[i]) {
                    res[i] = a[i1][0];
                    a[i1][1] = 0;
                    break;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j][1] == 1) {
                        res[i] = a[j][0];
                        a[j][1] = 0;
                        break;
                    }
                }
            }
        }
        return res;
    }
}
