package finished.No905_按奇偶排序数组;

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int begin = 0;
        int end = A.length-1;
        while (begin < end) {
            int i = A[begin] % 2;
            int j = A[end] % 2;
            if (i == 1 && j == 1) {
                end--;
            } else if (i == 0 && j == 1) {
                begin++;
                end--;
            } else if (i == 0 && j == 0) {
                begin++;
            } else if (i == 1 && j == 0) {
                int temp = A[begin];
                A[begin] = A[end];
                A[end] = temp;
                begin++;
                end--;
            }
        }
        return A;
    }
}
