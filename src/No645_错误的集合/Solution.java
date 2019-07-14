package No645_错误的集合;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i] - 1]++;
        }
        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                result[1] = i + 1;
            } else if (a[i] == 2) {
                result[0] = i + 1;
            } else if (result[0] != 0 && result[1] != 0) {
                break;
            }
        }
        return result;
    }
}
