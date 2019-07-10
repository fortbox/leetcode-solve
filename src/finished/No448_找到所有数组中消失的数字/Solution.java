/**
 * 
 */
package finished.No448_找到所有数组中消失的数字;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Henry Xiao
 * @date 2019年6月21日
 */
public class Solution {

	public static void main(String[] args) {

		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		Solution solution = new Solution();
		System.out.println(solution.findDisappearedNumbers_1(nums).toString());
	}

	/**
	 * 用hashset实现
	 */
	public List<Integer> findDisappearedNumbers(int[] nums) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		int n = nums.length;
		for (int i = 0; i < nums.length; i++) {
			hashSet.add(nums[i]);
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 1; i < n + 1; i++) {
			if (!hashSet.contains(i)) {
				arrayList.add(i);
			}
		}
		return arrayList;
	}

	/**
	 * 巧用数组下标
	 */
	public List<Integer> findDisappearedNumbers_1(int[] nums) {
		int n = nums.length;
		int[] temps = new int[n];
		for (int i = 0; i < n; i++) {
			temps[nums[i] - 1] = -1;
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (temps[i] == 0) {
				arrayList.add(i + 1);
			}
		}

		return arrayList;
	}

}
