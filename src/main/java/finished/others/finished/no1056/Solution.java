/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1056;

class Solution {
    public static void main(String[] args) {
        int N = 89;
        boolean f = confusingNumber(N);
        System.out.println("f = " + f);
    }

    public static boolean confusingNumber(int N) {
        String s = String.valueOf(N);
        char[] array = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            switch (array[i]) {
                case '0':
                    builder.append('0');
                    break;
                case '1':
                    builder.append('1');
                    break;
                case '6':
                    builder.append('9');
                    break;
                case '8':
                    builder.append('8');
                    break;
                case '9':
                    builder.append('6');
                    break;
                default:
                    return false;
            }
        }
        return !s.equals(builder.toString());
    }
}