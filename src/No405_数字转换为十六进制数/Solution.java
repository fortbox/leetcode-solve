package No405_数字转换为十六进制数;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		System.out.println(solution.toHex(17777));
	}
	
	public String toHex(int num) {
		String s="";
		int k=num/16;
		int m=num%16;
		if (k<16) {
			s=s+this.redirect(k);
		}else {
			s=toHex(k)+s;
		}
		s=s+this.redirect(m);
		return s;
		
	}
	
	private String redirect(int n) {
		if (n<10) {
			return String.valueOf(n);
		}
		if (n==10) {
			return "a";
		}
		if (n==11) {
			return "b";
		}
		if (n==12) {
			return "c";
		}
		if (n==13) {
			return "d";
		}
		if (n==14) {
			return "e";
		}
		if (n==15) {
			return "f";
		}
		return null;
	}

}
