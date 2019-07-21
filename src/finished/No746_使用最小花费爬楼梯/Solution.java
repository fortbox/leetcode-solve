package finished.No746_使用最小花费爬楼梯;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //Find the smaller value of the last step and take the next step and the last step.
        //lenth>=2,lenth<=1000
        int[] step = new int[1024];
        step[0] = cost[0];
        step[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            step[i] = cost[i]+Math.min(step[i-1],step[i-2]);
        }
        return Math.min(step[cost.length-1],step[cost.length-2]);
    }
}
