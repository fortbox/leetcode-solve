/*
 * Copyright (c) 2020
 * @Author:xiaoweixiang
 */

package finished.no6;

public class Solution {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String res = convert(s, numRows);
        System.out.println("res = " + res);
        String red = convert1(s, numRows);
        System.out.println("red = " + red);

    }

    public static String convert1(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int cul = 0;
        int index = 0;
        int len = s.length();
        while (index < s.length()) {
            if (index + numRows <= len) {
                cul++;
                index += numRows;
            } else {
                cul++;
                break;
            }
            if (index == s.length()) {
                break;
            }
            if (index + numRows - 2 <= len) {
                cul += numRows - 2;
                index += numRows - 2;
            } else {
                cul += len - index;
                break;
            }
        }

        System.out.println("cul = " + cul);

        char[][] chars = new char[numRows][cul];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                chars[i][j] = '0';

            }
        }
        int ind = 0;
        for (int j = 0; j < chars[0].length; j++) {
            for (int i = 0; i < chars.length; i++) {
                if (ind == len) {
                    break;
                }
                if (j % (numRows - 1) == 0) {
                    chars[i][j] = s.charAt(ind);
                    ind++;
                } else {
                    int k = j % (numRows - 1);
                    chars[numRows - 1 - k][j] = s.charAt(ind);
                    ind++;
                    break;
                }
            }
            if (ind == len) {
                break;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                if (chars[i][j] != '0') {
                    builder.append(chars[i][j]);
                }
            }
        }
        return builder.toString();
    }

    public static String convert(String s, int numRows) {
        if (numRows >= s.length()) {
            return s;
        }
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] ss = new StringBuilder[numRows];
        int k = numRows - 1;
        boolean rFlag = false;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("s.charAt(i) = " + s.charAt(i));
            int j = i / k;
            int m = i % k;
            if (j % 2 == 0 && (m == 0 || m == k)) {
                rFlag = false;
                if (ss[0] == null) {
                    ss[0] = new StringBuilder();
                }
                ss[0].append(s.charAt(i));
            } else if (j % 2 == 1 && (m == 0 || m == k)) {
                rFlag = true;
                if (ss[ss.length - 1] == null) {
                    ss[ss.length - 1] = new StringBuilder();
                }
                ss[ss.length - 1].append(s.charAt(i));
            } else {
                System.out.println("k = " + k);
                System.out.println("m = " + m);
                int r = rFlag ? k - m : m;
                System.out.println("r = " + r);
                if (ss[r] == null) {
                    ss[r] = new StringBuilder();
                }
                ss[r].append(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder builder : ss) {
            System.out.println("builder.toString() = " + builder.toString());
            res.append(builder);
        }
        return res.toString();
    }
}
