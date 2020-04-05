/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No605_种花问题;

public class Solution {
    public static void main(String[] args) {
        int[] flowerbed = {0,0,0,0,1,0,0,1};
        int n = 5;
        Solution solution = new Solution();
        boolean result=solution.canPlaceFlowers(flowerbed,n);
        System.out.println("result = " + result);


    }
    /**
     * @param flowerbed
     * @param n
     * @return
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length==1&&flowerbed[0]==0&&n==1) return true;
        if (n==0) {
            return true;
        }
        int k=0;
        int sumk=0;
        boolean f=false;
        for (int i = 0; i < flowerbed.length; i++) {
            int temp=flowerbed[i];
            if ((i==0&&temp==0)||(i==flowerbed.length-1&&temp==0)){
                k+=1;
            }
            if (temp==0){
                k+=1;
            }else {
                sumk=k;
                k=0;
                f=true;

            }
            if (i==flowerbed.length-1&&temp==0){
                sumk=k;
                f=true;
            }
            if (sumk>0&&f){
                int a1=sumk-1;
                if (a1>0){
                    n=n-a1/2;
                }
                f=false;
            }
            if (n<=0){
                return true;
            }
        }
        return false;
    }
}
