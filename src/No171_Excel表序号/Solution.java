package No171_Excel表序号;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String s="ZYAAA";
		int n=solution.titleToNumber(s);
		System.out.println(n);

	}
	
	public int titleToNumber(String s) {
		int n=0;
		char[] carray=s.toCharArray();
		for (int i = 0; i < carray.length; i++) {
			n=n+(int) Math.pow(26, carray.length-i-1)*(int)(carray[i]-'A'+1);
		}
		return n;
	}

}
