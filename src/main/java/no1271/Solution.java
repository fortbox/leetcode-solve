/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1271;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public String toHexspeak(String num) {
        String ss = Long.toHexString(Long.parseLong(num)).replace('1', 'I').replace('0', 'O').toUpperCase();
        HashSet<Character> set = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'I', 'O'));
        System.out.println("ss = " + ss);
        for (int i = 0; i < ss.length(); i++) {
            Character c = ss.charAt(i);
            if (!set.contains(c)) return "ERROR";
        }
        return ss;
    }
}
