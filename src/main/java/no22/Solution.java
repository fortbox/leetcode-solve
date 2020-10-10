/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no22;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        // 求出所有，然后再判断是否满足要求
        List<String> res = new ArrayList<>();
        dfs(res, 0, 0, n, "");
        return res;
    }

    private void dfs(List<String> list, int left, int right, int n, String s) {
        if (right > left || left > n || right > n) return;
        if (left == n && right == n) list.add(s);
        dfs(list, left + 1, right, n, s + "(");
        dfs(list, left, right + 1, n, s + ")");
    }
}
