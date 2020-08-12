package no1539;

import java.util.Arrays;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        boolean[] array = new boolean[arr[arr.length - 1] + 1];
        Arrays.stream(arr).forEach(i -> array[i] = true);
        for (int i = 1; i < array.length; i++) {
            if (!array[i]) k--;
            if (k == 0) return i;
        }
        return arr[arr.length - 1] + k;
    }
}
