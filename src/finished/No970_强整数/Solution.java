package finished.No970_强整数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Object> hashSet = new HashSet<>();
        boolean fa = (int) Math.pow(x, 0) != (int) Math.pow(x, 1);
        boolean fb = (int) Math.pow(y, 0) != (int) Math.pow(y, 1);
        for (int i = 0; Math.pow(x, i) <= bound && fa; i++) {
            for (int j = 0; Math.pow(x, i) + Math.pow(y, j) <= bound && fb; j++) {
                int k = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (hashSet.add(k)) {
                    list.add(k);
                }
            }
        }
        if (fa && !fb) {
            for (int i = 0; Math.pow(x, i) <= bound; i++) {
                int k = (int) (Math.pow(x, i) + Math.pow(y, 0));
                if (hashSet.add(k)) {
                    list.add(k);
                }
            }
        }
        if (!fa && fb) {
            for (int j = 0; Math.pow(x, 0) + Math.pow(y, j) <= bound; j++) {
                int k = (int) (Math.pow(x, 0) + Math.pow(y, j));
                if (hashSet.add(k)) {
                    list.add(k);
                }
            }
        }
        if (!fa && !fb) {
            int k = (int) (Math.pow(x, 0) + Math.pow(y, 0));
            if (k <= bound) {
                if (hashSet.add(k)) {
                    list.add(k);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}
