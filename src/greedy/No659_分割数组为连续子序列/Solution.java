package greedy.No659_分割数组为连续子序列;

import java.util.HashMap;

public class Solution {
    /**
     * 题目暗示了，必须是从1开始的连续整数
     * 刚开始没注意到这个，导致看答案也没看明白。
     *
     * @param nums
     * @return
     */
    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        HashMap<Integer, Integer> end = new HashMap<>();
        for (int i : nums) {
            counter.put(i, counter.getOrDefault(i, 0) + 1);
        }
        for (int num : nums) {
            if (counter.getOrDefault(num, 0) == 0) {
                continue;
            } else if (end.getOrDefault(num, 0) > 0) {
                end.put(num, end.get(num) - 1);
                end.put(num + 1, end.getOrDefault(num + 1, 0) + 1);
            } else if (counter.getOrDefault(num + 1, 0) > 0 && counter.getOrDefault(num + 2, 0) > 0) {
                counter.put(num + 1, counter.get(num + 1) - 1);
                counter.put(num + 2, counter.get(num + 2) - 1);
                end.put(num + 3, end.getOrDefault(num + 3, 0) + 1);
            } else {
                return false;
            }
            counter.put(num, counter.get(num) - 1);
        }
        return true;
    }

}
