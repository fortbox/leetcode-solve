/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no666;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {110, 218, 315, 326, 423, 433};
        int res = solution.pathSum(nums);
        System.out.println("res = " + res);
    }

    public int pathSum(int[] nums) {
        //先计算所有节点值得和，然后遍历，看看那些需要重复加一下。
        int sum = 0;
        for (int num : nums) {
            sum += String.valueOf(num).charAt(2) - '0';
        }
        String[] ss = new String[nums.length];
        for (int i = 1; i < nums.length; i++) {
            String s1 = String.valueOf(nums[i - 1]);
            String s2 = String.valueOf(nums[i]);
            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);
            ss[i - 1] = s1;
            ss[i] = s2;
            if (s1.charAt(0) == s2.charAt(0)) {
                if ((s1.charAt(1) - '0') % 2 == 1 && s1.charAt(1) + 1 == s2.charAt(1)) {
                    System.out.println("----");
                    int lay = s1.charAt(0) - '1';
                    int no = (s2.charAt(1) - '0') / 2;
                    String tmp = "" + lay + no;
                    for (String s : ss) {
                        if (s.startsWith(tmp)) {
                            System.out.println("s = " + s);
                            sum += getFatherTotal(s, ss);
                            break;
                        }
                    }
                }
            }
        }
        return sum;
    }

    private int getFatherTotal(String s, String[] ss) {
        int res = 0;
        int lay = s.charAt(0) - '0';
        int no = s.charAt(1) - '0';
        int val = s.charAt(2) - '0';
        res += val;
        if (lay == 1) {
            return res;
        }
        lay -= 1;
        System.out.println("lay = " + lay);
        no = (no - 1) / 2 + 1;
        System.out.println("no = " + no);
        String temp = "" + lay + no;
        System.out.println("temp = " + temp);
        String st = "";
        for (String s1 : ss) {
            System.out.println("s1 = " + s1);
            if (s1.startsWith(temp)) {
                st = s1;
                break;
            }
        }
        return res + getFatherTotal(st, ss);
    }
}
