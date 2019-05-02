package No168_Excel表名称;

public class Solution {

	public static void main(String[] args) {
		int n = 12321479;
		Solution solution = new Solution();
		System.out.println(solution.convertToTitle(n));
		System.out.println(solution.convert(n));

	}

	/**
	 * 思路：26进制的问题 写一个子函数来一一对应字母，主函数用来判断位数。
	 * 
	 * @param n
	 * @return
	 */
	public String convertToTitle(int n) {
		StringBuilder stringBuilder = new StringBuilder();
		while (n > 0) {
			int c = n % 26;
			n = n / 26;
			if (c == 0 ) {
				stringBuilder.append("Z");
				n=n-1;
			} else {
				stringBuilder.append(numToString(c));
			}
		}
		return stringBuilder.reverse().toString();
	}

	public String numToString(int n) {
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] c = a.toCharArray();
		System.out.println(c[n-1]);
		return String.valueOf(c[n - 1]);
	}
	
	public String convert(int n) {
		StringBuilder stringBuilder = new StringBuilder();
		while(n>0) {
			n--;
			int c = n % 26;
			stringBuilder.append((char)('A'+c));
			n=n/26;
		}
		return stringBuilder.reverse().toString();
	}
	
	

}
