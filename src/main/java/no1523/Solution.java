package no1523;

class Solution {
    public int countOdds(int low, int high) {
        int dif = high - low;
        if (low % 2 == 1) {
            if (dif % 2 == 1) {
                return 1 + dif / 2;
            } else {
                return 1 + dif / 2;
            }
        } else {
            if (dif % 2 == 1) {
                return 1 + dif / 2;
            } else {
                return dif / 2;
            }
        }
    }
}
