package greedy.finished.No376_摆动序列;

class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dif = new int[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            dif[i - 1] = nums[i] - nums[i - 1];
        }
        int res = 1;
        boolean f = false;
        int k = 0;
        for (int i = 0; i < dif.length; i++) {
            if (dif[i] == 0) {
                k++;
                continue;
            }
            if (k == i) {
                k = -1;
                if (dif[i] > 0) {
                    res++;
                    f = true;//positive
                } else {
                    res++;
                    f = false;//negative
                }
            } else {
                if (dif[i] > 0 && !f) {
                    res++;
                    f = true;
                }
                if (dif[i] < 0 && f) {
                    res++;
                    f = false;
                }

            }
        }
        return res;
    }
}