package finished.No371_两整数之和;

public class Solution {

	public static void main(String[] args) {

		int a=1;
		int b=2;
		Solution solution = new Solution();
		int c=solution.getSum(a, b);
		System.out.println(c);
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int getSum(int a, int b) {
		if (b==0) {
			return a;
		}
		int c=a^b;
		int d=(a&b)<<1;
		return getSum(c,d);
	}

}
