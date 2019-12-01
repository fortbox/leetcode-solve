package greedy.No1253_重构2行二进制矩阵;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<List<Integer>> list = new ArrayList<>();
        for (int i : colsum) {
            if (i == 0) {
                list1.add(0);
                list2.add(0);
            } else if (i == 1) {
                if (upper > lower) {
                    upper--;
                    list1.add(1);
                    list2.add(0);
                } else {
                    lower--;
                    list1.add(0);
                    list2.add(1);
                }

            } else if (i == 2) {
                upper--;
                lower--;
                list1.add(1);
                list2.add(1);
            }
        }
        if (upper != 0 || lower != 0) {
            return new ArrayList<>();
        }
        list.add(list1);
        list.add(list2);
        return list;
    }
}
