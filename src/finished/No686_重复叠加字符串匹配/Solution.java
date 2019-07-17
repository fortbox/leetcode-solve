package finished.No686_重复叠加字符串匹配;

class Solution {
    public int repeatedStringMatch(String A, String B) {
        String temp = A;
        int count = 1;
        while (A.length() < B.length()) {
            A += temp;
            count++;
        }
        if (A.contains(B)) return count;
        A += temp;
        count++;
        if (A.contains(B)) return count;
        return -1;
    }
}