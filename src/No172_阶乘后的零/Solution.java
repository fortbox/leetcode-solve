package No172_阶乘后的零;

public class Solution {

	public static void main(String[] args) {
		int n = 10;
		Solution solution = new Solution();
		int a=solution.trailingZeroes(n);
		System.out.println(a);
		System.out.println(solution.jiecheng(n));
	}

	/**
	 * 给定一个整数n，返回n！结果尾数中零的数量。
	 * 
	 * 思路： 1，尾数为零，说明有*10，几个零说明乘以了几个10，10=2*5，则说明乘以了多少的5和2
	 * 2，2肯定是够的，因为8就等于2*2*2，4=2*2,而5有可能不足，则说明有几个零取决于几个5. 3，那么，来判断几个5就有几个零。
	 * 
	 * @param n
	 * @return
	 */
	public int trailingZeroes(int n) {
		int m = 0;
		while (n > 0) {
			m = m + n / 5;
			n = n / 5;
		}
		return m;
	}

	public int jiecheng(int n) {
		if (n<=1) {
			return n;
		}
		return n*jiecheng(n-1);
	}
}
