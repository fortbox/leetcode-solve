package finished.No944_删列造序;

class Solution {
    public int minDeletionSize(String[] A) {
        //对列遍历,找出不是非降序的列,相加
        int result = 0;
        int row = A.length;
        int column = A[0].length();
        for (int i = 0; i < column; i++) {
            for (int j = 1; j < row; j++) {
                char before = A[j - 1].charAt(i);
                char now = A[j].charAt(i);
                if (before - now > 0) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
