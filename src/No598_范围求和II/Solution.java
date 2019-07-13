package No598_范围求和II;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int m = 3, n = 3;
        int m = 39999;
        int n = 39999;
        int[][] ops = {{19999, 19999}};
//        int[][] ops =new int[0][0];
        int result = solution.maxCount(m, n, ops);
        System.out.println("result = " + result);
    }

    /**
     * 定义一个数组，然后遍历，相加1
     *
     * @param m
     * @param n
     * @param ops
     * @return
     */
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }
        int asize = ops[0][0];
        int bsize = ops[0][1];
        for (int i = 1; i < ops.length; i++) {
            for (int j = 0; j < 2; j++) {
                int a = ops[i][0];
                int b = ops[i][1];
                if (asize > a) {
                    asize = a;
                }
                if (bsize > b) {
                    bsize = b;
                }
            }
        }
        return asize * bsize;
    }
}
