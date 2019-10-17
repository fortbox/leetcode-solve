public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println("canJump(nums) = " + canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int far = 0, next = 0, n = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            far = Math.max(far, i + nums[i]);
            if (i == next) {
                n += far - next;
                next = far;

            }
        }
        return n >= nums.length - 1;
    }
}
