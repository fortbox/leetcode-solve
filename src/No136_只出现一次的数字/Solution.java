package No136_只出现一次的数字;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        long startTime=System.nanoTime();   //获取开始时间

        int [] nums={2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        Solution solution = new Solution();
        System.out.println(solution.singleNumber2(nums));
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");

    }

    /**
     * 最通用的方法，也是最慢的
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }


    /**
     * 这种是排序，然后两两比较，效率有所提升
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; ) {
            if (nums[i+1]!=nums[i]) {
                return nums[i];
            }
            i+=2;
        }
        return nums[nums.length-1];
    }
    /**
     * 异或，这种比较简单，直接。运用了基本的数学知识
     * 少了排序的时间，效率最高
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums){
        int a=nums[0];
        for (int i = 1; i < nums.length; i++) {
            a^=nums[i];
        }
        return a;
    }


}
