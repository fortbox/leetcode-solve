package No575_分糖果;

import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candies) {
        int n=candies.length;
        int m=n/2;
        HashSet set = new HashSet();
        for (int i = 0; i < candies.length; i++) {
            if (set.size()>=m) break;
            set.add(candies[i]);
        }

        return set.size();
    }
}
