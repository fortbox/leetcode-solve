package ToDo.No1010_总持续时间可被60整除的歌曲;

class Solution {
    public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] a = new int[60];
        for (int i : time) {
            a[i % 60]++;
        }
        count += a[0] * (a[0] - 1) / 2 + a[30] * (a[30] - 1) / 2;
        for (int i = 1; i < 30; i++) {
            count += a[i] * a[60 - i];
        }
        return count;
    }
}
