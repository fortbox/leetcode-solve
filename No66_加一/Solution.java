package No66_加一;

public class Solution {

	public static void main(String[] args) {
		int[] digits = {9,9,9,9,9,9};
		int[] a = plusOne(digits);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static int[] plusOne(int[] digits) {
			for (int i = digits.length-1; i>=0; i--) {
				if (digits[i]<9) {
					digits[i]++;
					return digits;
				}else{
					digits[i]=0;
				}
			}
			int[] oneDigits=new int[digits.length+1];
			/**
			 * 发现根本不需要arraycopy这一步，这一步是多余的
			 */
//			System.arraycopy(digits, 0, oneDigits, 1, digits.length);
			oneDigits[0]=1;
			return oneDigits;
	}
}
