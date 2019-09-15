package ToDo.No1009_十进制整数的反码;

class Solution {
    public int bitwiseComplement(int N) {
        String s = Integer.toBinaryString(N);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') {
                stringBuffer.append('1');
            }
            if (c == '1') {
                stringBuffer.append('0');
            }
        }
        s = stringBuffer.toString();
        return Integer.parseInt(s, 2);
    }
}
