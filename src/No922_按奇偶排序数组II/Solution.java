package No922_按奇偶排序数组II;

import java.util.Arrays;

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int alen = A.length;
        int[] ou = new int[alen / 2];
        int[] ji = new int[alen / 2];

        int i = 0;
        int j = 0;
        for (int i1 : A) {
            if (i1 % 2 == 0) {
                ou[i++] = i1;
            } else {
                ji[j++] = i1;
            }
        }
        i = 0;
        j = 0;
        Arrays.sort(ou);
        Arrays.sort(ji);
        for (int k = 0; k < A.length; k++) {
            if (k % 2 == 0) {
                A[k] = ou[i++];
            } else {
                A[k] = ji[j++];
            }
        }
        return A;
    }
}
