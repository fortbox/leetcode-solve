package No326_3的幂;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false;
		}
		if (n==1) {
			return true;
		}
		while (n >= 3) {
			if (n == 3) {
				return true;
			}
			if (n % 3 == 0) {
				n = n / 3;
			} else {
				return false;
			}
		}
		return false;
	}

}
