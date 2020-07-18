/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package cxy0508;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int length = 3;
        int w = 96;
        int x1 = 0;
        int x2 = 95;
        int y = 0;
        int[] res = drawLine(length, w, x1, x2, y);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }

    public static int[] drawLine(int length, int w, int x1, int x2, int y) {
        // 负数在计算机中的存储形式是其同值正数的补码。
        int height = length * 32 / w;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < w; i++) builder.append('0');
        for (int i = x1; i <= x2; i++) builder.setCharAt(i, '1');
        List<Integer> list = new ArrayList<>();
        int begin = 0;
        String s = builder.toString();
        int wi = w / 32;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < wi; j++) {
                list.add(0);
            }
        }
        while (begin < w) {
            int cc = 0b11111111111111111111111111111110;
            System.out.println("cc = " + cc);
            String tmp = s.substring(begin, begin + 32);
            System.out.println("tmp len = " + tmp.length());
            System.out.println("tmp = " + tmp);
            if (tmp.charAt(0) == '1') {
                String t = tmp.substring(1);
                int n = Integer.parseInt(t, 2);
                System.out.println("n0 = " + n);
                n -= 1;
                n = ~n;
                String s1 = Integer.toBinaryString(n);
                list.add(Integer.parseInt("-" + s1.substring(1), 2));
            } else {
                list.add(Integer.parseInt(tmp, 2));
            }
            begin += 32;
        }
        for (int i = y + 1; i < height; i++) {
            for (int j = 0; j < wi; j++) {
                list.add(0);
            }
        }
        return list.stream().mapToInt(value -> value).toArray();
    }
}
