package No788_旋转数字;

class Solution {
    public int rotatedDigits(int N) {
        int num = 0;
        for (int i = 0; i <= N; i++) {
            boolean flag = false;
            int temp = i;
            while (temp != 0) {
                int val = temp % 10;
                if (val == 3 || val == 4 || val == 7) {
                    flag = false;
                    break;
                }
                else if (val == 2 || val == 5 || val == 6 || val == 9)
                    flag = true;
                temp = temp / 10;
            }
            if (flag) num++;
        }
        return num;
    }

}