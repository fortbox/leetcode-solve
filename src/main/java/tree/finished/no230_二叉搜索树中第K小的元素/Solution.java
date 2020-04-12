/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package tree.finished.no230_二叉搜索树中第K小的元素;

import java.util.concurrent.PriorityBlockingQueue;

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        /**
         * 定义一个为k的优先队列
         * 暴利解法 pre_order
         */
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>(k, (o1, o2) -> o2.intValue() - o1.intValue());
        dfs(root, queue, k);
        return queue.peek();
    }

    /**
     * 先序
     * @param root
     * @param queue
     * @param k
     */
    private void dfs(TreeNode root, PriorityBlockingQueue<Integer> queue, int k) {
        if (root == null) return;
        int val = root.val;
        if (queue.size() < k) {
            queue.add(val);
        } else {
            int temp = queue.peek();
            System.out.println("temp = " + temp);
            if (val < temp) {
                queue.poll();
                queue.add(val);
            }
        }
        dfs(root.left,queue,k);
        dfs(root.right,queue,k);
    }
}