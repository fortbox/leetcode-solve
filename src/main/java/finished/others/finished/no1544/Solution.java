package finished.others.finished.no1544;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "leEeetcode";
        String res = solution.makeGood(s);
        System.out.println("res = " + res);
    }

    public String makeGood(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            int dif = s.charAt(i + 1) - s.charAt(i);
            if (dif == 'A' - 'a' || dif == 'a' - 'A') {
                return makeGood(s.substring(0, i) + s.substring(i + 2));
            }
        }
        return s;
    }
}
