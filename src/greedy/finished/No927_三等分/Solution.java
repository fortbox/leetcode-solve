package greedy.No927_三等分;

public class Solution {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0,
                0};
        int[] res = threeEqualParts(a);
        System.out.println("res = " + res[0] + "," + res[1]);
    }


    public static int[] threeEqualParts(int[] A) {
        StringBuilder sb = new StringBuilder();
        int[] fail = {-1, -1};
        int count_1 = 0;
        for (int i : A) {
            if (i == 1) count_1++;
            sb.append(i);
        }
        if (count_1 == 0) {
            return new int[]{0, A.length - 2};
        }
        if (count_1 % 3 != 0) {
            return fail;
        }
        int k = count_1 / 3;
        int[] a1 = new int[2];
        int[] a2 = new int[2];
        int[] a3 = new int[2];
        int m = 0, n = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                m++;
                if (m == 1) {
                    if (n == 0) a1[0] = i;
                    if (n == 1) a2[0] = i;
                    if (n == 2) a3[0] = i;
                }
                if (m == k) {
                    m = 0;
                    if (n == 0) a1[1] = i;
                    if (n == 1) a2[1] = i;
                    if (n == 2) a3[1] = i;
                    n++;
                }
            }

        }
        int[] res = new int[2];
        if (a3[1] == A.length - 1) {
            res[0] = a1[1];
            res[1] = a2[1] + 1;
        } else {
            int num_3_0 = A.length - a3[1] - 1;
            int num_2_0 = a3[0] - a2[1] - 1;
            int num_1_0 = a2[0] - a1[1] - 1;
            if (num_2_0 >= num_3_0 && num_1_0 >= num_3_0) {
                res[0] = a1[1] + num_3_0;
                res[1] = a2[1] + num_3_0 + 1;
            } else {
                return fail;
            }
        }
        String s1 = sb.substring(a1[0], res[0] + 1);
        String s2 = sb.substring(a2[0], res[1]);
        String s3 = sb.substring(a3[0]);
        return s1.equals(s2) && s2.equals(s3) ? res : fail;
    }
}
