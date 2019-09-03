package finished.No985_查询后的偶数和;

import java.util.ArrayList;

class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i1 : A) {
            if (i1 % 2 == 0) {
                sum += i1;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            if (A[index] % 2 == 0) {
                sum -= A[index];
            }
            A[index] = A[index] + val;
            if (A[index] % 2 == 0) {
                sum += A[index];
            }
            list.add(sum);
        }
        int[] result = new int[list.size()];
        int k = 0;
        for (Integer integer : list) {
            result[k++] = integer;
        }
        return result;
    }
}
