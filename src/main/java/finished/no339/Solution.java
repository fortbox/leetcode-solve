/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no339;

import java.util.List;

class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        /**
         * 看评论才理解这道题的题目
         */
        return depthSum(nestedList, 1);
    }

    private int depthSum(List<NestedInteger> nestedList, int deep) {
        int sum = 0;
        for (NestedInteger i : nestedList) {
            if (i.isInteger()) {
                sum += i.getInteger() * deep;
                continue;
            }
            sum += depthSum(i.getList(), deep + 1);
        }
        return sum;
    }
}
