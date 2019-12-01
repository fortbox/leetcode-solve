package greedy.finished.No1090_受标签影响的最大值;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {

        int[][] a = new int[values.length][2];
        for (int i = 0; i < values.length; i++) {
            a[i][0] = values[i];
            a[i][1] = labels[i];
        }
        Arrays.sort(a, ((o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]));
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] aa : a) {
            int value = aa[0];
            int label = aa[1];
            if (list.size() < num_wanted) {
                if (map.getOrDefault(label, 0) < use_limit) {
                    list.add(value);
                    map.put(label, map.getOrDefault(label, 0) + 1);
                }
            }
        }
        int res = 0;
        for (Integer integer : list) {
            res += integer;
        }
        return res;
    }
}
