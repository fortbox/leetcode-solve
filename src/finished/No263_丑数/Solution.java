package finished.No263_丑数;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int num=14;
		boolean flag=solution.isUgly(num);
		System.out.println(flag);

	}
	
	public boolean isUgly(int num) {
		if (num<=0) {
			return false;
		}
		if (num==1||num==2||num==3||num==5) {
			return true;
		}
		if (num%2==0) {
			num=num/2;
			return isUgly(num);
		}
		if (num%3==0) {
			num=num/3;
			return isUgly(num);
		}
		if (num%5==0) {
			num=num/5;
			return isUgly(num);
		}
		return false;
	}

}
