package No70_爬楼梯;

public class Solution {

	public static void main(String[] args) {
		System.out.println(climbStairs(44));

	}

	/***
	 * 最后一步是1或者2，所以有两种方案，所以总次数=两种方案的次数之和.(超出时间限制)
	 * @param n
	 * @return 总补数
	 */
	public static int climbStairs1(int n) {
		if (n==1) {
			return 1;
		}else if (n==2) {
			return 2;
		}
		return climbStairs(n-1)+climbStairs(n-2);
	}
	
	/***
	 * 最后一步是1或者2，所以有两种方案，所以总次数=两种方案的次数之和.(用更直接的方式相加)
	 * @param n
	 * @return 总补数
	 */
	public static int climbStairs(int n) {
		int a1=1;
		int a2=2,a3 = 0;
		if (n==1) {
			return 1;
		}else if (n==2) {
			return 2;
		}
		for (int i = 3; i <= n; i++) {
			a3=a1+a2;
			a1=a2;
			a2=a3;
		}
		return a3;
	}
}
