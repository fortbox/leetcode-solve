 /*
  * Copyright (c) 2020
  * Author: xiaoweixiang
  */

 package no240;

 import java.util.Arrays;

 class Solution {
     public boolean searchMatrix(int[][] matrix, int target) {
         if (matrix.length == 0) return false;
         for (int i = 0; i < matrix.length; i++) {
             int[] arr = matrix[i];
             if (arr.length == 0) continue;
             if (arr[0] > target) continue;
             if (arr[arr.length - 1] < target) continue;
             int index = Arrays.binarySearch(arr, target);
             if (index >= 0) return true;
         }
         return false;
     }
 }
