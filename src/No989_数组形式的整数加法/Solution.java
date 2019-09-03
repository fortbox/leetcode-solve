package No989_数组形式的整数加法;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        String sk = String.valueOf(K);
        int i = A.length - 1;
        int j = sk.length() - 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int plus = 0;
        while (i >= 0 && j >= 0) {
            int k = A[i] + sk.charAt(j) - '0' + plus;
            if (k >= 10) {
                plus = 1;
                k -= 10;
            } else {
                plus = 0;
            }
            System.out.println("k = " + k);
            System.out.println("plus = " + plus);
            arrayList.add(0, k);
            i--;
            j--;
        }
        if (i >= 0) {
            for (int m = i; m >= 0; m--) {
                int k = A[m] + plus;
                if (k >= 10) {
                    plus = 1;
                    k -= 10;
                } else {
                    plus = 0;
                }
                arrayList.add(0, k);
            }
        }
        if (j >= 0) {
            for (int m = j; m >= 0; m--) {
                int k = sk.charAt(m) - '0' + plus;
                if (k >= 10) {
                    plus = 1;
                    k -= 10;
                } else {
                    plus = 0;
                }
                arrayList.add(0, k);
            }
        }
        if (plus > 0) {
            arrayList.add(0, plus);
        }
        return arrayList;
    }
}
