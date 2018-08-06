package No14_最长公共前缀;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs={"aa","a","aaa"};
		System.out.println(longestCommonPrefix(strs));

	}

	/**
	 * 最长公共前缀
	 * 思路：
	 * 1，循环遍历一遍，每次比较这次的字符串与上次保留的公共部分还有多少公共的，如果有，继续下面循环，如果没有则跳出循环。
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length==0){
			return "";
		}
		String cp=strs[0];
		String s="";
		for (int i = 1; i < strs.length; i++) {
			s=strs[i];
			cp=commonPrefix(cp,s);
			if(cp.length()==0){
				break;
			}
		}
		return cp;
		
	}
	
	private static String commonPrefix(String cp,String s) {
		if(cp.length()>s.length()){
			cp=cp.substring(0,s.length());
		}else {
			s=s.substring(0,cp.length());
		}
		for (int i = 0; i < s.length(); i++) {
			if(cp.charAt(i)!=s.charAt(i)){
				cp=cp.substring(0, i);
				break;
			}
		}
		return cp;
	}

}
