package No476_数字的补数;

public class Solution {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int num=5;
		System.out.println(solution.findComplement(num));
	}
	public int findComplement(int num) {
		// 1.先判断几位
		String s = Integer.toBinaryString(num);
		int n = s.length();
		System.out.println(n);
		int c = 0;
		// 2.再求和
		for (int i = n - 1; i >= 0; i--) {
			char k = s.charAt(i);
			int m = '1' - k;
			c = c + (int) Math.pow(2, n - 1 - i) * m;
		}
		return c;
	}
}
