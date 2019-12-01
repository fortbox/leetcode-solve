package greedy.No1094_拼车;

import java.util.Arrays;

public class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (o1, o2) -> o1[1] == o2[1] ? o1[2] - o2[2] : o1[1] - o2[1]);
        for (int i = 0; i < trips.length; i++) {
            int num_passengers = trips[i][0];
            int start_location = trips[i][1];
            int a = 0;
            for (int j = 0; j < i; j++) {
                int num = trips[j][0];
                int end = trips[j][2];
                if (end > start_location) {
                    a += num;
                }
            }
            if (capacity - a < num_passengers) {
                return false;
            }
        }
        return true;
    }
}
