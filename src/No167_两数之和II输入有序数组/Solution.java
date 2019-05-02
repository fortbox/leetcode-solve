package No167_两数之和II输入有序数组;

import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numbers= {2, 7, 11, 15};
		int target=9;
		int[] r=solution.twoSum(numbers, target);
		System.out.println(Arrays.toString(r));
	}
	/**
	 * 写个子函数，查找某个数，返回下表；
	 * 循环相减，然后调用子函数。
	 * @param numbers
	 * @param target
	 * @return
	 */
    public int[] twoSum(int[] numbers, int target) {
    	int[] indexArray=new int[2];
    	indexArray[0]=0;
    	indexArray[1]=0;
    	for (int i = 0; i < numbers.length; i++) {
			indexArray[0]=i+1;
			indexArray[1]=findNum(numbers,i+1,target-numbers[i]);
			if (indexArray[1]!=0) {
				return indexArray;
			}
		}
    	return null;
        
    }
    public int findNum(int[] numbers,int beginIndex,int target) {
		for (int i = beginIndex; i < numbers.length; i++) {
			if (numbers[i]==target) {
				return i+1;
			}
		}
		return 0;
	}
}
