package finished.No860_柠檬水找零;

import java.util.HashMap;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);
        for (int i = 0; i < bills.length; i++) {
            int k = bills[i];
            if (k == 5) {
                map.put(5, map.get(5) + 1);
            } else if (k == 10) {
                if (map.get(5) < 1) {
                    return false;
                } else {
                    map.put(10, map.get(10) + 1);
                    map.put(5, map.get(5) - 1);
                }
            } else if (k == 20) {
                if (map.get(5) < 1) {
                    return false;
                } else if (map.get(10) < 1) {
                    if (map.get(5) < 3) {
                        return false;
                    } else {
                        map.put(20, map.get(20) + 1);
                        map.put(5, map.get(5) - 3);
                    }
                } else {
                    map.put(10, map.get(10) - 1);
                    map.put(5, map.get(5) - 1);
                }
            }
        }
        return true;
    }
}
