package No830_较大分组的位置;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        int k = 0;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i - 1) == S.charAt(i)) {
                if (i==S.length()-1){
                    if (i-k>=2){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(k);
                        list.add(i);
                        lists.add(list);
                    }
                }
            } else {
                if (i-1-k>=2){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(k);
                    list.add(i-1);
                    lists.add(list);
                }
                k=i;

            }
        }
        return lists;
    }
}
