package finished.No997_找到小镇的法官;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int findJudge(int N, int[][] trust) {
        if (trust == null || trust.length == 0) {
            if (N == 1) {
                return 1;
            } else {
                return -1;
            }
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int[] ints : trust) {
            String a = String.valueOf(ints[0]);
            String b = String.valueOf(ints[1]);
            if (hashMap.containsKey(b)) {
                List<String> list = hashMap.get(b);
                list.add(a);
                hashMap.put(b, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(a);
                hashMap.put(b, list);
            }
        }
        for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            List<String> list = entry.getValue();
            if (list.size() == N - 1) {
                int k = Integer.parseInt(key);
                if (this.search(k, trust)) return k;
            }

        }
        return -1;
    }

    private boolean search(int k, int[][] trust) {
        for (int[] ints : trust) {
            int a = ints[0];
            if (k == a) return false;
        }
        return true;
    }
}
