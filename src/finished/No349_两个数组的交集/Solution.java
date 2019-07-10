package finished.No349_两个数组的交集;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
			return new int[0];
		}
		HashSet<Integer> hashSet1 = new HashSet<>();
		HashSet<Integer> hashSet2 = new HashSet<>();
		HashSet<Integer> hashSet3 = new HashSet<>();
		for (int i = 0; i < nums1.length; i++) {
			hashSet1.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			hashSet2.add(nums2[i]);
		}

		for (Iterator<Integer> iterator = hashSet1.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (hashSet2.contains(integer)) {
				hashSet3.add(integer);
			}
		}
		if (hashSet3.size() == 0) {
			return new int[0];
		}
		int[] num = new int[hashSet3.size()];

		int i = 0;
		for (Iterator<Integer> iterator2 = hashSet3.iterator(); iterator2.hasNext();) {
			Integer integer = (Integer) iterator2.next();
			num[i++] = integer.intValue();
		}
		return num;
	}

}
