package finished.No961_重复N次的元素;

import java.util.HashSet;

class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : A) {
            if (!hashSet.add(i)) return i;
        }
        return 0;
    }
}
