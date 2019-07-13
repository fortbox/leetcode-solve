package finished.No599_两个列表的最小索引总和;

import java.util.ArrayList;

public class Solution {

    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> list = new ArrayList<>();
        int m = list1.length;
        int n = list2.length;
        int k = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int i1 = 0; i1 < list2.length; i1++) {
                if (list1[i].equals(list2[i1])) {
                    if (k > i + i1) {
                        k=i+i1;
                        list.clear();
                        list.add(list1[i]);
                    }else if (k==i+i1){
                        list.add(list1[i]);
                    }
                    break;
                }
            }
        }
        String[] ss = new String[list.size()];
        int i = 0;
        for (String s : list) {
            ss[i++] = s;
        }
        return ss;
    }

}

