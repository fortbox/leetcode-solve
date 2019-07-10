/**
 * 
 */
package finished.No443_压缩字符串;

/**
 * @author Henry Xiao
 * @date 2019年6月20日
 */
public class Solution {
	public static void main(String[] args) {

		Solution solution = new Solution();
		char[] chars = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
		int size = solution.compress(chars);
		System.out.println(size);
	}

/**
 * 空间复杂度不是O(1);
 */
	public int compress(char[] chars) {
		int len = chars.length;
		if (len <= 1) {
			return len;
		}
		StringBuilder stringBuilder = new StringBuilder();
		char temp = chars[0];
		stringBuilder.append(temp);
		int size = 1;
		int count = 1;
		for (int i = 1; i < len; i++) {
			if (chars[i] == temp) {
				if (count == 1) {
					size += 1;
				}
				count += 1;
				if (i == len - 1 && count > 1) {
					stringBuilder.append(count);
					if (count >= 10) {
						size += 1;
					}
				}
			} else if (chars[i] != temp) {
				if (count > 1) {
					stringBuilder.append(count);
				}
				temp = chars[i];
				stringBuilder.append(temp);
				if (count >= 10) {
					size += 2;
				} else {
					size += 1;
				}
				count = 1;
			}
		}
		char[] cc = stringBuilder.toString().toCharArray();
		System.out.println(cc);
		System.out.println(cc.length);
		for (int i = 0; i < cc.length; i++) {
			chars[i] = cc[i];
		}
		return size;
	}

}
