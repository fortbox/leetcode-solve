package No38_报数;

public class Solution {

	public static void main(String[] args) {
		int n = 5;
		String s = countAndSay(n);
		System.out.println(s);

	}

	public static String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		// 递归求得上一个字符串
		String preStr = countAndSay(n - 1);
		String nowStr = "";
		int cursor = 0;
		if (preStr == "1") {
			nowStr = "11";
		}
		// 根据上个字符串，求得本次字符串
		for (int i = 1; i < preStr.length(); i++) {
			// 处理中间的字符
			if (preStr.charAt(i) != preStr.charAt(i - 1)) {
				String tstr = preStr.substring(cursor, i);
				nowStr = nowStr + String.valueOf(tstr.length()) + preStr.charAt(i - 1);
				cursor = i;
			}
			// 处理最后一个字符
			if ((i == preStr.length() - 1)) {
				String tstr = preStr.substring(cursor);
				nowStr = nowStr + String.valueOf(tstr.length()) + preStr.charAt(i);

			}
		}
		return nowStr;

	}
	
	
	  public String countAndSay1(int n) {
	        String str = "1";
	        if(n==1){
	            return str;
	        }
	        for (int i = 1; i < n; i++) {
	            int count = 1;
	            StringBuilder sb = new StringBuilder();
	            char lastOne = '1';
	            for (int j = 1; j < str.length(); j++) {
	                if(str.charAt(j) == str.charAt(j-1)){
	                    count++;
	                }else {
	                    sb.append(count).append(lastOne = str.charAt(j-1));
	                    count = 1;
	                }
	            }
	            sb.append(count).append(str.charAt(str.length()-1));
	            str = sb.toString();
	        }
	        return str;
	    }

}
