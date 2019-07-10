package finished.No405_数字转换为十六进制数;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		System.out.println(solution.toHex(-2));
//		System.out.println(0xffffffff + Integer.valueOf(solution.toHex(1)).intValue());
	}

	public String toHex(int num) {
		if (num == 0) {
			return "0";
		}
		char[] ca = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		String s = "";
		while (num != 0) {
			s = ca[num & 0xf]+s;
			num = (num >>> 4);
		}
		return s;
	}

}
