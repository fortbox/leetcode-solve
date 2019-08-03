package No888_公平的糖果交换;

class Solution {
    public static void main(String[] args) {
        int[] A = {1, 1};
        int[] B = {2, 2};
        int[] result = fairCandySwap(A, B);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }


    public static int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        int[] result = new int[2];
        for (int i : A) {
            sumA += i;
        }
        for (int i : B) {
            sumB += i;
        }
        int kA = sumA - sumB;
        for (int i = 0; i < A.length; i++) {
            for (int i1 = 0; i1 < B.length; i1++) {
                if (kA==2*(A[i]-B[i1])) {
                    result[0] = A[i];
                    result[1] = B[i1];
                    return result;
                }
            }
        }
        return result;
    }
}
