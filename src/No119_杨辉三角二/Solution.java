package No119_杨辉三角二;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.getRow(3).toString());

	}
	
    public List<Integer> getRow(int rowIndex) {
    	int n=rowIndex;
    	if (n == 0) {
    		Integer[] a = new Integer[] { 1 };
			List<Integer> newlist = Arrays.asList(a);
			return newlist;
		} else if (n == 1) {
			Integer[] a = new Integer[] { 1,1 };
			List<Integer> newlist = Arrays.asList(a);
			return newlist;
		} 

		List<Integer> newlist = getRow(n - 1);;
		Integer[] last = (Integer[]) newlist.toArray();
		Integer[] array = new Integer[n+1];
		array[0] = 1;
		array[n ] = 1;
		for (int i = 1; i < n ; i++) {
			array[i] = last[i - 1] + last[i];
		}
		newlist = Arrays.asList(array);
		return newlist;
    }
	

}
