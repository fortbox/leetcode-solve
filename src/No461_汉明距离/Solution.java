package No461_汉明距离;

public class Solution {

	public static void main(String[] args) {
		int x = 1, y = 2;
		Solution solution = new Solution();
		int n = solution.hammingDistance(x, y);
		System.out.println("n=" + n);
	}

	public int hammingDistance(int x, int y) {
		int k = x ^ y;
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(k);
		int i = 1;
		int j = 32;
		int n = 0;
		while (j > 0) {
			int m = k & i;
			if (m != 0) {
				n++;
			}
			i = i << 1;
			j--;
		}
		return n;
	}
}
