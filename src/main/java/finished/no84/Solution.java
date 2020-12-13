/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no84;

import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        // 利用单调栈的性质，再利用面积的性质
        if (heights == null || heights.length == 0) return 0;
        int maxAero = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= heights.length; i++) {
            int value = i == heights.length ? -1 : heights[i];
            while (!stack.isEmpty() && heights[stack.peek()] > value) {
                int height = heights[stack.pop()];
                int left = stack.isEmpty() ? 0 : (stack.peek() + 1);
                int right = i - 1;
                maxAero = Math.max(maxAero, (height * (right - left + 1)));
            }
            stack.push(i);
        }
        return maxAero;
    }
}
