/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No441_排列硬币;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int n=5;
        System.out.println(solution.arrangeCoins(n));
    }
    public int arrangeCoins(int n){
        //二元一次方程求解
        int k=(int)(-1+Math.sqrt(1+8*(long)n))/2;
        return k;
    }
}
