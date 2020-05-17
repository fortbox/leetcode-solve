/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1436;

import java.util.List;

class Solution {
    public String destCity(List<List<String>> paths) {
        for (List<String> path : paths) {
            String s = path.get(path.size() - 1);
            if (isEnd(s, paths)) return s;
        }
        return null;
    }

    private boolean isEnd(String s, List<List<String>> paths) {
        for (List<String> path : paths) {
            if (path.contains(s) && !path.get(path.size() - 1).equals(s)) {
                return false;
            }
        }
        return true;
    }
}
