package finished.No412_Fizz_Buzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		System.out.println(solution.fizzBuzz(15).toString());
	}

	public List<String> fizzBuzz(int n) {
		String s1 = "Fizz";
		String s2 = "Buzz";
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			String s;
			if (i%3==0&&i%5!=0) {
				s=s1;
			}else if(i%3!=0&&i%5==0) {
				s=s2;
			}else if(i%3==0&&i%5==0) {
				s=s1+s2;
			}else {
				s=String.valueOf(i);
			}
			list.add(s);
		}
		return list;
	}
}
