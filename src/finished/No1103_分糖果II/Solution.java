package finished.No1103_分糖果II;

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] store = new int[num_people];
        int loopTimes = 0;
        a:
        while (candies > 0) {
            for (int i = 1; i <= num_people; i++) {
                int n = loopTimes * num_people + i;
                if (candies > n) {
                    store[i - 1] += n;
                    candies -= n;
                } else {
                    store[i - 1] += candies;
                    break a;
                }
            }
            loopTimes++;
        }
        return store;
    }
}
