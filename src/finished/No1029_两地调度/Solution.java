package finished.No1029_两地调度;

import java.util.Arrays;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length / 2;
        int[] a = new int[costs.length];
        int[] b = new int[costs.length];
//        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < costs.length; i++) {
            a[i] = costs[i][0];
            b[i] = costs[i][1] - costs[i][0];
        }
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
//        for (int i = 0; i < b.length; i++) {
//            map.put(i,b[i]);
//        }
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            sum += b[i];
        }
        return sum;
    }
}
