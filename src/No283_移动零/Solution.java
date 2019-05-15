package No283_移动零;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void moveZeroes(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				swap(i, nums);
			}
		}
	}

	public void swap(int i, int[] nums) {
		for (int j = i + 1; j < nums.length; j++) {
			if (nums[j] != 0) {
				nums[i] = nums[j];
				nums[j] = 0;
				break;
			}
		}
	}
	
	/**
	 * method 2
	 * @param nums
	 */
	public void moveZeroes_2(int[] nums) {
		for (int i = 0; i < nums.length;i++) {
			if (nums[i]==0) {
				for (int j = i+1; j < nums.length; j++) {
					if (nums[j]!=0) {
						nums[i]=nums[j];
						nums[j]=0;
					}
				}
			}
			
		}
	}

}
