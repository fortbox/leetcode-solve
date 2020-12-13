/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no1678;

class Solution {
    public String interpret(String command) {
        return command.replace("(al)", "al").replace("()", "o");
    }
}