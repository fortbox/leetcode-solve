/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no157;

/**
 * The read4 API is defined in the parent class Reader4.
 * int read4(char[] buf);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return The number of actual characters read
     */
    public int read(char[] buf, int n) {
        int k = 0;
        int index = 0;
        while (true) {
            char[] chars = new char[4];
            int tmp = read4(chars);
            if (k + tmp >= n) {
                for (int i = 0; i < tmp && index < n; i++) {
                    buf[index++] = chars[i];
                }
                return n;
            }
            for (int i = 0; i < tmp; i++) {
                buf[index++] = char
            }
            if (tmp == 0) {
                break;
            }
            k += tmp;
        }
        return k;
    }
}
