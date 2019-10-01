package finished.No1030_距离顺序排列矩阵单元格;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int R = 4;
        int C = 9;
        int r0 = 3;
        int c0 = 8;
        int[][] result = allCellsDistOrder(R, C, r0, c0);
        System.out.println(Arrays.toString(result));
    }


    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int k = Math.abs(i - r0) + Math.abs(j - c0);
                Integer key = k;
                String value = i + "," + j;
                if (map.containsKey(key)) {
                    List<String> list = map.get(key);
                    list.add(value);
                    map.put(key, list);
                } else {
                    ArrayList<String> list = new ArrayList<>();
                    list.add(value);
                    map.put(key, list);
                    arrayList.add(key);
                }
            }
        }
        Collections.sort(arrayList);
        int[][] result = new int[R * C][2];
        int i = 0;
        for (int n : arrayList) {
            List<String> list = map.get(n);
            map.remove(String.valueOf(n));
            for (String s : list) {
                String[] ss = s.split(",");
                result[i][0] = Integer.parseInt(ss[0]);
                result[i][1] = Integer.parseInt(ss[1]);
                i++;
            }
        }
        return result;
    }
}
