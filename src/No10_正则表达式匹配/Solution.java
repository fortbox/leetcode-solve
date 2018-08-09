package No10_正则表达式匹配;

public class Solution {

	public static void main(String[] args) {
		String s="3";
		if(s.equals("")){
			System.out.println("l");
		}
		String j=s;
		s="fjk";
		System.out.println(j+s);
				

	}

	/**
	 * 1，非空判断
	 * 2，分两种情况：
	 			1，首字母可以匹配到
	 * @param s
	 * @param p
	 * @return
	 */
	public boolean isMatch(String s, String p) {
		1，如果s为空，则返回true
		2，判断s的首字母，如果不能与p的首字母匹配，则p去除首字母后，再比较s的首字母是否与p的首字母匹配
		3，如果s的首字母与p的首字母匹配，则比较s的第二个字母是否与p的第二个字母匹配，如果不匹配，则去除p的前两个字母，
		  然后判断s的首字母是否与p的首字母匹配，循环上面。
		4，如果前两个字母匹配，则s的第三个字母是否与p的第三个字母匹配，如果不匹配，则上面的循环
		5，如果匹配，则s的第四个字母是否与p的第四个字母匹配，如果不匹配，则上面的循环
		6，如果匹配，则比较、、，依次循环
		
		1）可以一直用s的首字母与p的首字母来匹配，如果出现不匹配，则s要从头匹配，p要去除已匹配的字母再来匹配。

		
		//如果s为空则不论p是否为空都返回true
		if("".equals(s)){
			return true;
		}
		//如果s不为空，p为空，则返回false
		if(!"".equals(s)&&"".equals(p)){
			return false;
		}
		
		//判断首字母是否匹配
		char cs=s.charAt(0);
		char cp=p.charAt(0);
		
		//记录p的上一个字符
		char pc;
		if(cs==cp||cp=='.'){
			pc=cs;
			String s1=s.substring(1, s.length());
			p=p.substring(1,p.length());
		}else if(cs!=cp){
			if(cp=='*'){
				if(cs==pc){
					p=cs+p;
				}else if(cs!=pc){
					p=p.substring(1,p.length());
				}
				
			}else{
				p=p.substring(1,p.length());
			}
		}
		return false;
	}

}
