package No551_学生出勤记录I;

public class Solution {

    /**
     * 遍历一遍s，如果超过指标则直接返回<br></>
     * 如果没有超过指标，则继续执行
     *
     * @param s
     * @return
     */
    public boolean checkRecord(String s) {
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                a++;
            }
            if (a > 1) {
                return false;
            }
            if (c == 'L' && i > 2) {
                if (s.charAt(i - 1) == 'L'&&s.charAt(i-1)=='L') {
                    return false;
                }
            }
        }
        return true;
    }
}
