/*
 * Copyright (c) 2020
 * @Author:xiaoweixiang
 */

package henry;

import java.util.HashSet;
import java.util.TreeSet;

public class Solution {
    public int totalFruit(int[] tree) {
        HashSet<Object> set1 = new HashSet<>();
        for (int i : tree) {
            set1.add(i);
        }
        if (set1.size() <= 2) {
            return tree.length;
        }
        /**
         * 只想到了暴力
         */

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < tree.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < tree.length; j++) {
                int n = set.size();
                if (!set.contains(tree[j])) {
                    if (n < 2) {
                        set.add(tree[j]);
                        if (j == tree.length - 1) {
                            System.out.println("i = " + i);
                            System.out.println("j = " + j);
                            treeSet.add(j - i + 1);
                        }
                    } else {
                        System.out.println("i = " + i);
                        System.out.println("j = " + j);
                        treeSet.add(j - i);
                        break;
                    }
                } else {
                    if (j == tree.length - 1) {
                        System.out.println("i = " + i);
                        System.out.println("j = " + j);
                        treeSet.add(j - i);
                    }
                }
            }
        }
        return treeSet.last();


    }
}

