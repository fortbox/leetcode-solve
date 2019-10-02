package finished.No1042_不邻接植花;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] gardens = new int[N];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(i + 1);
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < paths.length; i++) {
            int[] path = paths[i];
            int key = path[0];
            int value = path[1];
            if (map.containsKey(key)) {
                List<Integer> arrayList = map.get(key);
                arrayList.add(value);
                map.put(key, arrayList);
            } else {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(value);
                map.put(key, arrayList);
            }
            key = path[1];
            value = path[0];
            if (map.containsKey(key)) {
                List<Integer> arrayList = map.get(key);
                arrayList.add(value);
                map.put(key, arrayList);
            } else {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(value);
                map.put(key, arrayList);
            }
        }
        for (int i = 1; i <= N; i++) {
            List<Integer> ll = map.get(i);
            if (ll != null) {
                int m = ll.size() > 0 ? gardens[ll.get(0) - 1] : 0;
                int n = ll.size() > 1 ? gardens[ll.get(1) - 1] : 0;
                int kk = ll.size() > 2 ? gardens[ll.get(2) - 1] : 0;
                for (int j = 1; j <= 4; j++) {
                    if (j != m && j != n && j != kk) {
                        gardens[i - 1] = j;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (gardens[i] == 0) {
                gardens[i] = 1;
            }
        }
        return gardens;
    }
}

