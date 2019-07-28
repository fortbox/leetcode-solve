package No849_到最近的人的最大距离;

class Solution {
    public int maxDistToClosest(int[] seats) {
        //1. Find the longest zero.
        int maxcount = 0;//Continuous 0
        int tempcount = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                tempcount++;
            } else {
                maxcount = Math.max(maxcount, tempcount);
                tempcount = 0;
            }
        }
        int n = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                n++;
            } else {
                break;
            }

        }
        //2. Find the middle value of the longest zero
        return Math.max(n, Math.max((maxcount + 1) / 2, tempcount));
    }
}
