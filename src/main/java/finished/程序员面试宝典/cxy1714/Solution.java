/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1714;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        String path = "NESWW";
        boolean res = isPathCrossing(path);
        System.out.println("res = " + res);
    }

    public static boolean isPathCrossing(String path) {
        char[] array = path.toCharArray();
        int x = 0, y = 0;
        ArrayList<String> list = new ArrayList<>();
        list.add(x + "@" + y);
        for (char c : array) {
            System.out.println(list.toString());
            switch (c) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                    System.out.println("why!!!");
                    break;
            }
            if (list.contains(x + "@" + y)) return true;
            list.add(x + "@" + y);
        }
        return false;
    }

    public int[] smallestK(int[] arr, int k) {
        return Arrays.stream(arr).sorted().limit(k).toArray();
    }

    public double average(int[] salary) {
        int minValue = Arrays.stream(salary).min().getAsInt();
        int maxValue = Arrays.stream(salary).max().getAsInt();
        return Arrays.stream(salary).filter(n -> n > Arrays.stream(salary).min().getAsInt() && n < Arrays.stream(salary).max().getAsInt()).average().getAsDouble();
    }
}
